package com.xworkz.clothingcompany.repository.impl;

import com.xworkz.clothingcompany.entity.ClothEntity;
import com.xworkz.clothingcompany.repository.ClothingCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Repository

public class ClothingCompanyRepositoryImpl implements ClothingCompanyRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(ClothEntity clothEntity) {
        boolean isSaved = false;
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(clothEntity);
            entityManager.getTransaction().commit();
            entityManager.close();
            isSaved=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSaved;
    }

    @Override
    public Optional<ClothEntity> findClothInfoById(int id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            ClothEntity clothEntity = entityManager.find(ClothEntity.class, id);
            if (clothEntity != null) return Optional.of(clothEntity);
            else System.err.println("Cloth Data not found!!!");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public boolean updatePriceById(int cId, double updatedPrice) {
        boolean isUpdated=false;

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            ClothEntity clothEntity = entityManager.find(ClothEntity.class,cId);
            if (clothEntity!=null){
                clothEntity.setPrice(updatedPrice);
                entityManager.merge(clothEntity);
                isUpdated=true;
            }else System.err.println("Cloth Data not found!!!");
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean deleteById(int clothId) {
        boolean isDeleted=false;
        try {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("deleteById");
            int rowsAffected = query.setParameter("id",clothId).executeUpdate();
            if (rowsAffected>0)
                isDeleted=true;
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }

    @Override
    public Optional<ClothEntity> findClothInfoByCategory(String clothCategory) {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("findClothInfoByCategory");
            query.setParameter("categoryName",clothCategory);
            ClothEntity clothEntity = (ClothEntity) query.getSingleResult();
            if (clothEntity!=null){
                return Optional.of(clothEntity);
            }else System.err.println("Data not Available!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public Optional<ClothEntity> findClothInfoByClothName(String clothName) {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("findClothInfoByClothName");
            query.setParameter("cName",clothName);
            ClothEntity clothEntity = (ClothEntity) query.getSingleResult();
            if (clothEntity!=null){
                return Optional.of(clothEntity);
            }else System.err.println("Data not Available!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<ClothEntity> findClothInfoByBrandName(String brandName) {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("findClothInfoByBrandName");
            query.setParameter("brand",brandName);
            ClothEntity clothEntity = (ClothEntity) query.getSingleResult();
            if (clothEntity!=null){
                return Optional.of(clothEntity);
            }else System.err.println("Data not Available!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<ClothEntity> findClothInfoBySize(String cSize) {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("findClothInfoBySize");
            query.setParameter("size",cSize);
            ClothEntity clothEntity = (ClothEntity) query.getSingleResult();
            if (clothEntity!=null){
                return Optional.of(clothEntity);
            }else System.err.println("Data not Available!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<ClothEntity> findClothInfoByColor(String clothColor) {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("findClothInfoByColor");
            query.setParameter("color",clothColor);
            ClothEntity clothEntity = (ClothEntity) query.getSingleResult();
            if (clothEntity!=null){
                return Optional.of(clothEntity);
            }else System.err.println("Data not Available!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<ClothEntity> filterClothsByCategory(String cCategory) {
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("filterClothsByCategory");
            query.setParameter("cCategory",cCategory);
            List<ClothEntity> clothEntities =  query.getResultList();
            if (clothEntities !=null){
                return clothEntities;
            }else System.err.println("Data not Available!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public List<ClothEntity> filterClothsByBrand(String bName) {
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("filterClothsByBrand");
            query.setParameter("bName",bName);
            List<ClothEntity> clothEntities =  query.getResultList();
            if (clothEntities !=null){
                return clothEntities;
            }else System.err.println("Data not Available!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public List<Object[]> findClothNameAndBrandAndPriceByCategory(String catgryName) {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("findClothNameAndBrandAndPriceByCategory");
            query.setParameter("cName",catgryName);
            List<Object[]> clothDetailsList = query.getResultList();
            if (clothDetailsList!=null){
                return clothDetailsList;
            }else System.err.println("Data Not Available");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    @Override
    public List<Object[]> fetchClothsListByCategoryAndPriceRange(String catName, double minPrice, double maxPrice) {
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("fetchClothsListByCategoryAndPriceRange");
            query.setParameter("cName",catName);
            query.setParameter("min",minPrice);
            query.setParameter("max",maxPrice);
            List<Object[]> clothDetailsList = query.getResultList();
            if (clothDetailsList!=null){
                return clothDetailsList;
            }else System.err.println("Data Not Available");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    @Override
    public List<ClothEntity> getClothsListByCategoryAndSize(String categoryName, String clSize) {

        try{

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("getClothsListByCategoryAndSize");
            query.setParameter("categoryName",categoryName);
            query.setParameter("cSize",clSize);

            List<ClothEntity> clothEntities = query.getResultList();
            if (clothEntities!=null){
                return clothEntities;
            }else System.err.println("Data Not Available!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    @Override
    public List<ClothEntity> getAllClothesDetails() {

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("getAllClothesDetails");
            List<ClothEntity> clothEntitiesList = query.getResultList();
            if (clothEntitiesList!=null) return clothEntitiesList;
            else System.err.println("Data Not Available!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public List<String> getAllClothesName() {
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("getAllClothesName");
            List<String> clotheNamesList = query.getResultList();
            if (clotheNamesList !=null) return clotheNamesList;
            else System.err.println("Data Not Available!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public List<String> getAllBrandNames() {
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("getAllBrandNames");
            List<String> brandNamesList = query.getResultList();
            if (brandNamesList!=null) return brandNamesList;
            else System.err.println("Data Not Available!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public List<String> getAllCategories() {
        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("getAllCategories");
            List<String> categoriesList = query.getResultList();
            if (categoriesList !=null) return categoriesList;
            else System.err.println("Data Not Available!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public List<ClothEntity> getClothsListByCategoryAndColor(String categoryName1, String color1) {
        try{

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createNamedQuery("getClothsListByCategoryAndColor");
            query.setParameter("categoryName",categoryName1);
            query.setParameter("color",color1);

            List<ClothEntity> clothEntities = query.getResultList();
            if (clothEntities!=null){
                return clothEntities;
            }else System.err.println("Data Not Available!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    @Override
    public List<ClothEntity> fetchClothsListByCategoryBrandAndPriceRange(String ctName, String bName1, double minPrice1, double maxPrice1) {

            try{
                EntityManager entityManager = entityManagerFactory.createEntityManager();
                Query query = entityManager.createNamedQuery("fetchClothsListByCategoryBrandAndPriceRange");
                query.setParameter("cName",ctName);
                query.setParameter("brand",bName1);
                query.setParameter("min",minPrice1);
                query.setParameter("max",maxPrice1);

                List<ClothEntity> clothEntities = query.getResultList();
                if (clothEntities!=null) return clothEntities;
                else System.err.println("Data Not Available!!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        return Collections.emptyList();
    }

    @Override
    public boolean checkDuplicateClothEntry(String clothName) {
        boolean isDuplicateEntry = false;
        try{

           EntityManager entityManager = entityManagerFactory.createEntityManager();
           Query query = entityManager.createNamedQuery("getDuplicateEntries");
           query.setParameter("clothName",clothName);
           List<ClothEntity> clothEntities = query.getResultList();

           if (clothEntities.listIterator().hasNext()){
               isDuplicateEntry=true;
           }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDuplicateEntry;
    }
}
