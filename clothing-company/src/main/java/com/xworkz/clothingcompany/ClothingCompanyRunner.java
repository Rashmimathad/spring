package com.xworkz.clothingcompany;

import com.xworkz.clothingcompany.dto.ClothDTO;
import com.xworkz.clothingcompany.service.ClothingCompanyService;
import com.xworkz.clothingcompany.service.impl.ClothingCompanyServiceImpl;
import com.xworkz.clothingcompany.util.EntityManagerFactoryUtility;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ClothingCompanyRunner {
    public static void main(String[] args) {

        ClothingCompanyService clothingCompanyService = new ClothingCompanyServiceImpl();

        System.out.println("Main started");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        boolean beginApp = true;

        while (beginApp){

            System.out.println("Select Choice from below");
            System.out.println("1. Add Cloth");
            System.out.println("2. Get Cloth Info by Id");
            System.out.println("3. Update cloth price by Id");
            System.out.println("4. Delete cloth by Id");
            System.out.println("5. Get Cloth Info by Category");
            System.out.println("6. Get Cloth Info by Cloth Name");
            System.out.println("7. Get Cloth Info by Brand Name");
            System.out.println("8. Get Cloth Info by Cloth Size");
            System.out.println("9. Get Cloth Info by Color");
            System.out.println("10. Filter by Category");
            System.out.println("11. Filter by Brand");
            System.out.println("12. Get ClothName, Size , Brand and Price by Category Name");
            System.out.println("13. Get Cloth Name,Size,Brand,Price by Category and Price Range");
            System.out.println("14. Get Cloth Info by Category and Size");
            System.out.println("15. Get Cloth Info by Category and color");
            System.out.println("16. Get Cloth Info by Category , Brand And Price Range");
            System.out.println("17. Get All Category Names");
            System.out.println("18. Get All Brand Names");
            System.out.println("19. Get All Clothes Names");
            System.out.println("20. Get All Clothes Details");
            System.out.println("21. Exit");
            System.out.println("---------------------------------------------------------");
            System.out.print("Enter your choice :");
            int ch = sc.nextInt();
            switch (ch){

                case 1 :
                    System.out.print("Enter the cloth name : ");sc.nextLine();
                    String cName= sc.nextLine();
                    System.out.print("Enter the brand Name : ");
                    String brand = sc.nextLine();
                    System.out.print("Enter the category name : ");
                    String category = sc.nextLine();
                    System.out.print("Enter cloth size : ");
                    String size = sc.next();
                    System.out.print("Enter color : ");sc.nextLine();
                    String color = sc.nextLine();
                    System.out.print("Enter price : ");
                    double price = sc.nextDouble();
                    System.out.print("Enter stock quantity : ");
                    int qty = sc.nextInt();
                    System.out.print("Enter availability status : ");sc.nextLine();
                    String availabilityStatus = sc.nextLine();

                    ClothDTO clothDTO = new ClothDTO(cName,brand,category,size,color,price,qty,availabilityStatus);
                    boolean isValidatedAndSaved = clothingCompanyService.validateAndSave(clothDTO);
                    if (isValidatedAndSaved) System.out.println("Data Validated and Saved");
                    else System.err.println("Data not validated and saved");
                    System.out.println("------------------------------------");
                    break;

                case 2 :
                    System.out.print("Enter cloth id to get cloth Info :");
                    int id = sc.nextInt();
                    Optional<ClothDTO> clothDTOOptional = clothingCompanyService.findClothInfoById(id);
                    if (clothDTOOptional.isPresent()){
                        System.out.println();
                        System.out.println("Cloth Info : ");
                        System.out.println("Cloth Id : "+clothDTOOptional.get().getClothId());
                        System.out.println("Cloth Name : "+clothDTOOptional.get().getClothName());
                        System.out.println("Brand Name : "+clothDTOOptional.get().getBrandName());
                        System.out.println("Cloth Category : "+clothDTOOptional.get().getCategoryName());
                        System.out.println("Cloth Size : "+clothDTOOptional.get().getSize());
                        System.out.println("Cloth Color : "+clothDTOOptional.get().getColor());
                        System.out.println("Cloth Price : "+clothDTOOptional.get().getPrice());
                        System.out.println("Cloth Stock Quantity : "+clothDTOOptional.get().getStockQuantity());
                        System.out.println("Cloth Availability Status : "+clothDTOOptional.get().getAvailabilityStatus());
                    }else System.err.println("Cloth Data not available!!!");
                    System.out.println("-------------------------------------------------");
                    break;

                case 3 :
                    System.out.print("Enter Id to be updated : ");
                    int cId = sc.nextInt();
                    System.out.print("Enter Updated Price : ");
                    double updatedPrice = sc.nextDouble();

                    boolean isUpdated = clothingCompanyService.updatePriceById(cId,updatedPrice);
                    System.out.println("Is Cloth with Id "+cId+" updated? "+isUpdated);
                    System.out.println("----------------------------------------------");
                    break;

                case 4 :
                    System.out.print("Enter the Id to delete : ");
                    int clothId = sc.nextInt();
                    boolean isDeleted = clothingCompanyService.deleteById(clothId);
                    System.out.println("Is Cloth with Id "+clothId+" deleted? "+isDeleted);
                    break;

                case 5 :
                    System.out.print("Enter category to fetch cloth Info : ");sc.nextLine();
                    String clothCategory = sc.nextLine();
                    Optional<ClothDTO> clothListByCategory = clothingCompanyService.findClothInfoByCategory(clothCategory);
                    if (clothListByCategory.isPresent()){
                        System.out.println();
                        System.out.println("Cloth Info : ");
                        System.out.println("Cloth Id : "+clothListByCategory.get().getClothId());
                        System.out.println("Cloth Name : "+clothListByCategory.get().getClothName());
                        System.out.println("Brand Name : "+clothListByCategory.get().getBrandName());
                        System.out.println("Cloth Category : "+clothListByCategory.get().getCategoryName());
                        System.out.println("Cloth Size : "+clothListByCategory.get().getSize());
                        System.out.println("Cloth Color : "+clothListByCategory.get().getColor());
                        System.out.println("Cloth Price : "+clothListByCategory.get().getPrice());
                        System.out.println("Cloth Stock Quantity : "+clothListByCategory.get().getStockQuantity());
                        System.out.println("Cloth Availability Status : "+clothListByCategory.get().getAvailabilityStatus());
                    }else System.err.println("Data no available");
                    System.out.println("----------------------------------");
                    break;

                case 6 :
                    System.out.print("Enter cloth name to fetch to fetch cloth Info : "); sc.nextLine();
                    String clothName = sc.nextLine();
                    Optional<ClothDTO> clothDTOOptional1 = clothingCompanyService.findClothInfoByClothName(clothName);
                    if (clothDTOOptional1.isPresent()){
                        System.out.println();
                        System.out.println("Cloth Info : ");
                        System.out.println("Cloth Id : "+clothDTOOptional1.get().getClothId());
                        System.out.println("Cloth Name : "+clothDTOOptional1.get().getClothName());
                        System.out.println("Brand Name : "+clothDTOOptional1.get().getBrandName());
                        System.out.println("Cloth Category : "+clothDTOOptional1.get().getCategoryName());
                        System.out.println("Cloth Size : "+clothDTOOptional1.get().getSize());
                        System.out.println("Cloth Color : "+clothDTOOptional1.get().getColor());
                        System.out.println("Cloth Price : "+clothDTOOptional1.get().getPrice());
                        System.out.println("Cloth Stock Quantity : "+clothDTOOptional1.get().getStockQuantity());
                        System.out.println("Cloth Availability Status : "+clothDTOOptional1.get().getAvailabilityStatus());
                    }else System.err.println("Data no available");
                    System.out.println("----------------------------------");
                    break;

                case 7 :
                    System.out.print("Enter Brand Name to get Cloth Info : ");sc.nextLine();
                    String brandName = sc.nextLine();
                    Optional<ClothDTO> clothDTOOptional2 = clothingCompanyService.findClothInfoByBrandName(brandName);
                    if (clothDTOOptional2.isPresent()){
                        System.out.println();
                        System.out.println("Cloth Info : ");
                        System.out.println("Cloth Id : "+ clothDTOOptional2.get().getClothId());
                        System.out.println("Cloth Name : "+ clothDTOOptional2.get().getClothName());
                        System.out.println("Brand Name : "+ clothDTOOptional2.get().getBrandName());
                        System.out.println("Cloth Category : "+ clothDTOOptional2.get().getCategoryName());
                        System.out.println("Cloth Size : "+ clothDTOOptional2.get().getSize());
                        System.out.println("Cloth Color : "+ clothDTOOptional2.get().getColor());
                        System.out.println("Cloth Price : "+ clothDTOOptional2.get().getPrice());
                        System.out.println("Cloth Stock Quantity : "+ clothDTOOptional2.get().getStockQuantity());
                        System.out.println("Cloth Availability Status : "+ clothDTOOptional2.get().getAvailabilityStatus());
                    }else System.err.println("Data no available");
                    System.out.println("----------------------------------");
                    break;


                case 8 :
                    System.out.print("Enter cloth size to get Cloth Info : ");sc.nextLine();
                    String cSize = sc.nextLine();
                    Optional<ClothDTO> clothDTOOptional3 = clothingCompanyService.findClothInfoBySize(cSize);
                    if (clothDTOOptional3.isPresent()){
                        System.out.println();
                        System.out.println("Cloth Info : ");
                        System.out.println("Cloth Id : "+ clothDTOOptional3.get().getClothId());
                        System.out.println("Cloth Name : "+ clothDTOOptional3.get().getClothName());
                        System.out.println("Brand Name : "+ clothDTOOptional3.get().getBrandName());
                        System.out.println("Cloth Category : "+ clothDTOOptional3.get().getCategoryName());
                        System.out.println("Cloth Size : "+ clothDTOOptional3.get().getSize());
                        System.out.println("Cloth Color : "+ clothDTOOptional3.get().getColor());
                        System.out.println("Cloth Price : "+ clothDTOOptional3.get().getPrice());
                        System.out.println("Cloth Stock Quantity : "+ clothDTOOptional3.get().getStockQuantity());
                        System.out.println("Cloth Availability Status : "+ clothDTOOptional3.get().getAvailabilityStatus());
                    }else System.err.println("Data no available");
                    System.out.println("----------------------------------");
                    break;

                case 9 :
                    System.out.print("Enter cloth color to get Cloth Info : ");sc.nextLine();
                    String clothColor = sc.nextLine();
                    Optional<ClothDTO> clothDTOOptional4 = clothingCompanyService.findClothInfoByColor(clothColor);
                    if (clothDTOOptional4.isPresent()){
                        System.out.println();
                        System.out.println("Cloth Info : ");
                        System.out.println("Cloth Id : "+ clothDTOOptional4.get().getClothId());
                        System.out.println("Cloth Name : "+ clothDTOOptional4.get().getClothName());
                        System.out.println("Brand Name : "+ clothDTOOptional4.get().getBrandName());
                        System.out.println("Cloth Category : "+ clothDTOOptional4.get().getCategoryName());
                        System.out.println("Cloth Size : "+ clothDTOOptional4.get().getSize());
                        System.out.println("Cloth Color : "+ clothDTOOptional4.get().getColor());
                        System.out.println("Cloth Price : "+ clothDTOOptional4.get().getPrice());
                        System.out.println("Cloth Stock Quantity : "+ clothDTOOptional4.get().getStockQuantity());
                        System.out.println("Cloth Availability Status : "+ clothDTOOptional4.get().getAvailabilityStatus());
                    }else System.err.println("Data no available");
                    System.out.println("----------------------------------");
                    break;

                case 10 :
                    System.out.print("Enter Category to filter cloths : ");sc.nextLine();
                    String cCategory = sc.nextLine();
                    List<ClothDTO> clothDTOList = clothingCompanyService.filterClothsByCategory(cCategory);
                    if (clothDTOList!=null){
                        System.out.println();
                        System.out.println("Cloths Info of "+cCategory+" category :");
                        clothDTOList.stream().forEach(clothDTO1 -> System.out.println(clothDTO1));
                    }else System.err.println("Data Not Available");
                    System.out.println("--------------------------------");
                    break;

                case 11 :
                    System.out.print("Enter brand name to filter cloths : ");sc.nextLine();
                    String bName = sc.nextLine();
                    List<ClothDTO> clothDTOListByBrand = clothingCompanyService.filterClothsByBrand(bName);
                    if (clothDTOListByBrand!=null){
                        System.out.println();
                        System.out.println("Cloths Info from "+bName+" Brand :");
                        clothDTOListByBrand.stream().forEach(clothDTO1 -> System.out.println(clothDTO1));
                    }else System.err.println("Data Not Available");
                    System.out.println("--------------------------------");
                    break;

                case 12 :
                    System.out.print("Enter the category name: ");sc.nextLine();
                    String catgryName = sc.nextLine();
                    List<Object[]> clothsDetailsList = clothingCompanyService.findClothNameAndBrandAndPriceByCategory(catgryName);
                    if (clothsDetailsList!=null){
                        System.out.println();
                        System.out.println("Cloths Details of "+catgryName+" category : ");
                        clothsDetailsList.stream().forEach(cloth->{
                            System.out.print("Cloth Name : "+cloth[0]);
                            System.out.print(" , Size : "+cloth[1]);
                            System.out.print(" , Brand : "+cloth[2]);
                            System.out.println(" , Price : "+cloth[3]);
                        });
                    }else System.err.println("Data not Available");
                    System.out.println("----------------------------------------------------");
                    break;

                case 13 :
                    System.out.print("Enter the Category : ");sc.nextLine();
                    String catName = sc.nextLine();
                    System.out.print("Enter the minimum price : ");
                    double minPrice = sc.nextDouble();
                    System.out.print("Enter the maximum price : ");
                    double maxPrice = sc.nextDouble();

                    List<Object[]> clothsListByCategoryAndPriceRange = clothingCompanyService.fetchClothsListByCategoryAndPriceRange(catName,minPrice,maxPrice);
                    if (clothsListByCategoryAndPriceRange!=null){
                        System.out.println();
                        System.out.println("Cloths of "+catName+" category from Price Range "+minPrice+" to "+maxPrice+" : ");
                        clothsListByCategoryAndPriceRange.stream().forEach(cloth->{
                            System.out.print("Cloth Name : "+cloth[0]);
                            System.out.print(" , Size : "+cloth[1]);
                            System.out.print(" , Brand : "+cloth[2]);
                            System.out.println(" , Price : "+cloth[3]);
                        });
                    }else System.err.println("Data not Available");
                    System.out.println("------------------------------------------");
                    break;

                case 14 :
                    System.out.print("Enter Category : ");sc.nextLine();
                    String categoryName = sc.nextLine();
                    System.out.print("Enter the Size : ");
                    String clSize = sc.next();
                    List<ClothDTO> clothsListByCategoryAndSize = clothingCompanyService.getClothsListByCategoryAndSize(categoryName,clSize);
                    if (clothsListByCategoryAndSize!=null){
                        System.out.println();
                        System.out.println("Cloths from "+categoryName+" category in "+clSize+" size : ");
                        clothsListByCategoryAndSize.stream().forEach(clothDTO1 -> {
                            System.out.println(clothDTO1);
                        });
                    }else System.err.println("Data not Available");
                    System.out.println("---------------------------------------------");
                    break;

                case 15 :
                    System.out.print("Enter Category : ");sc.nextLine();
                    String categoryName1 = sc.nextLine();
                    System.out.print("Enter the color : ");
                    String color1 = sc.next();
                    List<ClothDTO> clothsListByCategoryAndColor = clothingCompanyService.getClothsListByCategoryAndColor(categoryName1, color1);
                    if (clothsListByCategoryAndColor!=null){
                        System.out.println();
                        System.out.println("Cloths from "+categoryName1+" category in "+ color1 +" Color : ");
                        clothsListByCategoryAndColor.stream().forEach(clothDTO1 -> {
                            System.out.println(clothDTO1);
                        });
                    }else System.err.println("Data not Available");
                    System.out.println("---------------------------------------------");
                    break;

                case 16 :
                    System.out.print("Enter the Category : ");sc.nextLine();
                    String ctName = sc.nextLine();
                    System.out.print("Enter brand name : ");
                    String bName1=sc.nextLine();
                    System.out.print("Enter the minimum price : ");
                    double minPrice1 = sc.nextDouble();
                    System.out.print("Enter the maximum price : ");
                    double maxPrice1 = sc.nextDouble();

                    List<ClothDTO> clothsListByCategoryBrandAndPriceRange = clothingCompanyService.fetchClothsListByCategoryBrandAndPriceRange(ctName,bName1,minPrice1, maxPrice1);
                    if (clothsListByCategoryBrandAndPriceRange!=null){
                        System.out.println();
                        System.out.println("Cloths of "+ctName+" category of "+bName1+" brand  from Price Range "+minPrice1+" to "+ maxPrice1 +" : ");
                        clothsListByCategoryBrandAndPriceRange.stream().forEach(cloth->{
                            System.out.println(cloth);
                        });
                    }else System.err.println("Data not Available");
                    System.out.println("------------------------------------------");
                    break;

                case 17 :
                    List<String> categoriesList = clothingCompanyService.getAllCategories();
                    if (categoriesList!=null){
                        System.out.println();
                        System.out.println("All Categories Names : ");
                        categoriesList.stream().forEach(category1 -> System.out.println(category1));
                    }else System.err.println("Data Not Available");
                    System.out.println("-------------------------------------------------------------");
                    break;

                case 18 :
                    List<String> brandNamesList = clothingCompanyService.getAllBrandNames();
                    if (brandNamesList!=null){
                        System.out.println();
                        System.out.println("All Brand Names : ");
                        brandNamesList.stream().forEach(brandName1 -> System.out.println(brandName1));
                    }else System.err.println("Data Not Available");
                    System.out.println("-------------------------------------------------------------");
                    break;

                case 19 :
                    List<String> clothesNamesList = clothingCompanyService.getAllClothesName();
                    if (clothesNamesList!=null){
                        System.out.println();
                        System.out.println("All Clothes Names : ");
                        clothesNamesList.stream().forEach(clotheName-> System.out.println(clotheName));
                    }else System.err.println("Data Not Available");
                    System.out.println("-------------------------------------------------------------");
                    break;

                case 20 :
                    List<ClothDTO> clothDTOS = clothingCompanyService.getAllClothesDetails();
                    if (clothDTOS!=null){
                        System.out.println();
                        System.out.println("All Clothes Details : ");
                        clothDTOS.stream().forEach(clothDTO1 -> {
                            System.out.println(clothDTO1);
                        });
                    }
                    System.out.println("---------------------------------------------------------------");
                    break;

                case 21 :
                    beginApp=false;
                    System.out.println("App Stopped");
                    EntityManagerFactoryUtility.close();
                    break;

                default:
                    System.err.println("Invalid choice!! Please choose other option");
                    EntityManagerFactoryUtility.close();
            }
        }
        System.out.println();
        System.out.println("Main ended");
    }
}
