package scanner.java;

import java.util.Scanner;

public class myMart
{
   Scanner scanner=new Scanner(System.in) ;

   void meth1() {
       System.out.println("-----------------------------------welcome to my mart-----------------------------------");
       System.out.println("                  enter your name                        ");
       String name = scanner.next();

       System.out.println("  enter your contactno ");
      // int contactno = scanner.nextInt();

       System.out.println("select 1 for menu");
       scanner.next();

       System.out.println("*****************(--MENU--)**********************");
       System.out.println("1)-----------------meat--------------------------");
       System.out.println("2)---------------vegetables----------------------");
       System.out.println("3)-----------------friuts------------------------");
       System.out.println("4)----------------grocerries---------------------");
       System.out.println("5)-------------------EXIT----------------------");


       System.out.println("  please select above section from menu   1  ");
       int customer = scanner.nextInt();

       if (customer == 1) {
           System.out.println("1--------chicken-----------");
           System.out.println("2---------prawns------------");
           System.out.println("3---------mutton------------");
           System.out.println("4----------fish-------------");

           System.out.println("select your items");
           int item = scanner.nextInt();
           if (item == 1) {
               System.out.println("             -you are selected chicken-               ");
               System.out.println("             -please enter how many kgs-              ");
               int kg = scanner.nextInt();
               int chickenprice;
               chickenprice = 200;
               int totalprice;
               if (kg == 1) {
                   totalprice = chickenprice * 1;
                   System.out.println("          TOTAL PRICE" + totalprice                     );
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name+  "you purchesed chicken"              );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
               if (kg == 2) {
                   totalprice = chickenprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 3) {
                   totalprice = chickenprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }


           }
           if (item == 2) {
               System.out.println("you are selected prawns");
               System.out.println("plese select how many kgs");
               int kg = scanner.nextInt();
               int prawnsprice;
               prawnsprice = 150;
               int totalprice;
               if (kg == 1) {
                   totalprice = prawnsprice * 1;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 2) {
                   totalprice = prawnsprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 3) {
                   totalprice = prawnsprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }


           }
           if (item == 3) {
               System.out.println("you are selected mutton");
               System.out.println("plese select how many kgs");
               int kg = scanner.nextInt();
               int muttonprice;
               muttonprice = 700;
               int totalprice;
               if (kg == 1) {
                   totalprice = muttonprice * 1;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
               if (kg == 2) {
                   totalprice = muttonprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
               if (kg == 3) {
                   totalprice = muttonprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
           }
           if (item == 4) {
               System.out.println("you are selected fish");
               System.out.println("please select hoe many kgs");
               int kg = scanner.nextInt();
               int fishprice;
               fishprice = 400;
               int totalprice;
               if (kg == 1) {
                   totalprice = fishprice * 1;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 2) {
                   totalprice = fishprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 3) {
                   totalprice = fishprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
           }
       } else if (customer == 2) {
           System.out.println("1--------carrot---------");
           System.out.println("2--------potato----------");
           System.out.println("3--------brinjal---------");
           System.out.println("4--------lemons----------");


           System.out.println("select your items");
           int item = scanner.nextInt();
           if (item == 1) {
               System.out.println("--you are selected carrot--");
               System.out.println("please enter how many kgs");
               int kg = scanner.nextInt();
               int carrotprice;
               carrotprice = 50;
               int totalprice;
               if (kg == 1) {
                   totalprice = carrotprice * 1;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
               if (kg == 2) {
                   totalprice = carrotprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 3) {
                   totalprice = carrotprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }

           }
           if (item == 2) {
               System.out.println("you are selected potato");
               System.out.println("plese select how many kgs");
               int kg = scanner.nextInt();
               int potatoprice;
               potatoprice = 40;
               int totalprice;
               if (kg == 1) {
                   totalprice = potatoprice * 1;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 2) {
                   totalprice = potatoprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 3) {
                   totalprice = potatoprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }

           }
           if (item == 3) {
               System.out.println("you are selected brinjal");
               System.out.println("plese select how many kgs");
               int kg = scanner.nextInt();
               int brinjalprice;
               brinjalprice = 30;
               int totalprice;
               if (kg == 1) {
                   totalprice = brinjalprice * 1;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
               if (kg == 2) {
                   totalprice = brinjalprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
               if (kg == 3) {
                   totalprice = brinjalprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

               }
           }

           if (item == 4) {
               System.out.println("you are selected lemons");
               System.out.println("please select hoe many kgs");
               int kg = scanner.nextInt();
               int lemonprice;
               lemonprice = 10;
               int totalprice;
               if (kg == 1) {
                   totalprice = lemonprice * 1;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 2) {
                   totalprice = lemonprice * 2;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
               if (kg == 3) {
                   totalprice = lemonprice * 3;
                   System.out.println("totalprice" + totalprice);
                   System.out.println("-----------------------------------------------------------------------------------");
                   System.out.println("-                     customer name:"+name                                          );
                   System.out.println("-                     your total bill is :"+totalprice                               );
                   System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
               }
           }




           } else if (customer == 3)
           {
               System.out.println("1-------apples---------");
               System.out.println("2--------banana--------");
               System.out.println("3--------orange--------");



               System.out.println("please select your items");
               int item = scanner.nextInt();
               if (item == 1) {
                   System.out.println("--you are selected ---apples--");
                   System.out.println("please enter how many kgs");
                   int kg = scanner.nextInt();
                   int appleprice;
                   appleprice = 50;
                   int totalprice;
                   if (kg == 1) {
                       totalprice = appleprice * 1;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

                   }
                   if (kg == 2) {
                       totalprice = appleprice * 2;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (kg == 3) {
                       totalprice = appleprice * 3;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }

               }

               if (item == 2) {
                   System.out.println("you are selected banana");
                   System.out.println("plese select how many kgs");
                   int kg = scanner.nextInt();
                   int bananaprice;
                   bananaprice = 40;
                   int totalprice;
                   if (kg == 1) {
                       totalprice = bananaprice * 1;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (kg == 2) {
                       totalprice = bananaprice * 2;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (kg == 3) {
                       totalprice = bananaprice * 3;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }

               }

               if (item == 3) {
                   System.out.println("you are selected orange");
                   System.out.println("plese select how many kgs");
                   int kg = scanner.nextInt();
                   int orangeprice;
                   orangeprice = 30;
                   int totalprice;
                   if (kg == 1) {
                       totalprice = orangeprice * 1;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

                   }
                   if (kg == 2) {
                       totalprice = orangeprice * 2;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

                   }
                   if (kg == 3) {
                       totalprice = orangeprice * 3;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

                   }
               }



           } else if (customer == 4)
           {
               System.out.println("1---------maydha--------");
               System.out.println("2---------almond--------");
               System.out.println("3---------soaps---------");
               System.out.println("4---------buscuitpakets--");



               System.out.println("please select your items");
               int item = scanner.nextInt();
               if (item == 1) {
                   System.out.println("--you are selected ---maydha--");
                   System.out.println("please enter how many kgs");
                   int kg = scanner.nextInt();
                   int maydhaprice;
                   maydhaprice = 55;
                   int totalprice;
                   if (kg == 1) {
                       totalprice = maydhaprice * 1;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (kg == 2) {
                       totalprice = maydhaprice * 2;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (kg == 3) {
                       totalprice = maydhaprice * 3;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }

               }

               if (item == 2) {
                   System.out.println("you are selected almond");
                   System.out.println("plese select how many kgs");
                   int kg = scanner.nextInt();
                   int almondprice;
                   almondprice = 140;
                   int totalprice;
                   if (kg == 1) {
                       totalprice = almondprice * 1;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (kg == 2) {
                       totalprice = almondprice * 2;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (kg == 3) {
                       totalprice = almondprice * 3;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }

               }

               if (item == 3) {
                   System.out.println("you are selected soaps");
                   System.out.println("plese select how many packs");
                   int pack = scanner.nextInt();
                   int soapprice;
                   soapprice = 500;
                   int totalprice;
                   if (pack == 1) {
                       totalprice = soapprice * 1;
                       System.out.println(" pack of 1 totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

                   }
                   if (pack == 2) {
                       totalprice = soapprice * 2;
                       System.out.println("pack of 2 totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

                   }
                   if (pack == 3) {
                       totalprice = soapprice * 3;
                       System.out.println("pack of 3 totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");

                   }
               }

               if (item == 4) {
                   System.out.println("you are selected biscuit packets ");
                   System.out.println("please select hoe many packets");
                   int packets = scanner.nextInt();
                   int packetprice;
                   packetprice =200;
                   int totalprice;
                   if (packets == 1) {
                       totalprice = packetprice * 1;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (packets == 2) {
                       totalprice = packetprice * 2;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
                   if (packets == 3) {
                       totalprice = packetprice * 3;
                       System.out.println("totalprice" + totalprice);
                       System.out.println("-----------------------------------------------------------------------------------");
                       System.out.println("-                     customer name:"+name                                          );
                       System.out.println("-                     your total bill is :"+totalprice                               );
                       System.out.println("----------------------THANK U FOR VISITING--------------------------------------");
                   }
               }


           } else
           {
               System.out.println("your are not selectd anything ");
               System.out.println("please visit once again");
           }


   }

    public static void main(String[] args)
    {
      myMart aobj =new myMart();
      aobj.meth1();
    }




}
