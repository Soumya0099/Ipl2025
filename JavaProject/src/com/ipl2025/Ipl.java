package com.ipl2025;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ipl
{
    static int a_btktprice=2500;
    static int c_dtktprice=1500;
    static int e_ftktprice=1000;

    String[] onfieldUmpires={"Adrian Holdstock","Akshay Totre"};
    String[] thirdumpire={"Rohan Pandit"};
    String[] stadiumplace={"Eden Gardens , Kolkata","Rajiv Gandhi International Stadium","MA Chidambaram Stadium"};

    Scanner user = new Scanner(System.in);
    private  int second()
    {
        System.out.println("<=========================>");
        System.out.println("Option For Buying Ticket\n");
        System.out.println("1.Buy Ticket Match Wise");
        System.out.println("2.For Cancel This option");
        System.out.println("----------------------------");
        System.out.println("Choose One Option From This");
        System.out.println("<===========================>");
        int secop=user.nextInt();
        return secop;
    }

    private  int upcoming ()  //Return Match info Value
    {
        String[] matachSeries ={"✨ KKR ✨  VS  ✨ RCB ✨","✨ SRH ✨  VS  ✨ RR ✨","✨ CSK ✨  VS  ✨ MI ✨","✨ DC ✨  VS  ✨ LSG ✨",
        "✨ GT ✨  VS  ✨ PKX11 ✨","✨ RR ✨  VS  ✨ KKR ✨","✨ SRH ✨  VS  ✨ LSG ✨ ","✨ CSK ✨ VS ✨ RCB ✨","✨ GT ✨ VS ✨ MI ✨","✨ DC ✨ VS ✨ SRH ✨"};
        int match=1;
        int date=22;
        System.out.println("🏏🏏=========================🏏🏏");
        System.out.println("       Upcoming IPL Matches");
        System.out.println("🏏🏏=========================🏏🏏");
        for (int i=0;i<=matachSeries.length-1;i++)
        {
            System.out.println(" \nMatch-- "+match++ +" ("+date++ +"-03-2025 )");
            System.out.println("---------------");
            System.out.println(matachSeries[i]);
            System.out.println("=================================");
        }

//                        System.out.println("✨🎉🎀");

        System.out.println("\n 🔥 View Details for Specified Match 🔥");
        System.out.println("==========================================");

        System.out.println("\nFor Match Info Press (Match number * 10) ");

        System.out.println("\n==========================================");
        int mtchnumber=user.nextInt();
        //user.nextLine();
        return mtchnumber;
    }


    private int matchinfo1(int matchreference )  //Return Squad Value calling from upcoming
    {
        switch (matchreference)
        {
            case 10:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        KKR                vs                 RCB");
                System.out.println("( Kolkata Knight Riders )       (Royal Challenge Bangalore)");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 20:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH             vs             RR");
                System.out.println("( Sunrises Hyderabad )       ( Rajasthan Royal )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 30:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        MI           vs           CSK");
                System.out.println("( Mumbai Indians )       ( Chennai Super Kings )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 40:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        LSG                vs          RR");
                System.out.println("( Lucknow Super Giants )       ( Delhi Capital )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 50:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        PBKS          vs          GT");
                System.out.println("( Punjab Kings 11 )       ( Gujarat Titans)");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 60:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        RR             vs             KKR");
                System.out.println("( Rajasthan Royals )       ( Kolkata Knight Riders )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 70:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH              vs            LSG");
                System.out.println("( Sunrises Hyderabad )       ( Lucknow Super Giants )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 80:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("         RCB                   vs            CSK");
                System.out.println("( Royal Challenge Bangalore )       ( Chennai Super Kings )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 90:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        GT           vs            MI");
                System.out.println("( Gujarat Titans )       ( Mumbai Indians )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }
            case 100:
            {
                System.out.println("---------------------> Match Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH             vs           DC");
                System.out.println("( Sunrises Hyderabad )       ( Delhi Capital )");
                System.out.println("\nVenue :  "+stadiumplace[0]);
                System.out.println("\nOn Field Umpires :  "+onfieldUmpires[0]+ "    ||  "+onfieldUmpires[1]);
                System.out.println("Third Umpire       : "+thirdumpire[0]);
                System.out.println("===========================================================");

                System.out.println("To view Squad Info Press This Match number * 11");
                int squad=user.nextInt();
                return squad;
            }

            default:
            {
                System.out.println("Enter Current option (Default)");
                return 0;
            }
        }
    }

    private void squadinfo( int squadno)  // return 99 for tkt
    {

        String kkrsquad[]={"Ajinkya Rahane (C) 🏏","Angkrish Ranghuvanshi 🏏","✈️ Quinton De Kock 🧤","✈️ Andre Russell 🏏🥎","✈️ Sunil Narine 🏏🥎", "Rinku Singh 🏏", "Manish Pandey 🏏","✈️ Rovman Powell 🏏","Harshit Rana 🥎"," Varun Chakaravarthy 🥎","✈️ Anrich Nortje 🥎  " };
        String rcbsquad[]={"  Virat Kohli 🏏","Rajat Patidar (c)🏏","✈️ Phil Salt 🧤","  Devdutta Padikkal 🏏","✈️ Liam Livingstone 🏏🥎"," Krunal Pandya 🏏🥎"," ✈️ Tim David 🏏🥎"," Bhuvneshwar Kumar 🥎"," ✈️ Romario Shepherd 🥎"," Yash Dayal 🥎"," Suyash Sharma 🥎"};
        String[] srhsquad={"  Aniket Verma 🏏"," ✈️ Travis Head 🏏"," Ishan Kishan 🧤","  Abhinav Manohar 🏏"," ✈️ Heinrich Klaasen 🏏🧤","Abhishek Sharma 🏏🥎"," Nitish Kumar Reddy 🏏🥎"," ✈️ Pat Cummins (c) 🥎","    Bhuvneshwar Kumar 🥎"," Harshal Patel 🥎","Mohammad Shami 🥎"," Rahul Chahar 🥎"};
        String[] misquad={" Rohit Sharma 🏏"," ✈️ Will Jacks 🏏"," ✈️ Ryan Rickelton 🧤","  N Tilak Varma 🏏"," Surya Kumar Yadav 🏏"," Hardik Pandya (c)🏏🥎"," Corbin Bosch 🥎"," ✈️ Trent Boult 🥎","Vignesh Puthur 🥎","Deepak Chahar 🥎","Jasprit Bumrah 🥎"," Karn Sharma 🥎"};
        String[] csksquad={" MS Dhoni 🏏🧤"," ✈️ Rachin Ravindra 🏏"," Ruturaj Gaikwad (c) 🧤"," Rahul Tripathi 🏏"," Devon Conway 🏏"," Shivam Dube🏏🥎"," Ravindra Jadeja 🥎"," ✈️ Sam Curran 🏏🥎","Ravichandran Ashwin 🏏🥎"," ✈️ Matheesha Pathirana 🥎"," Khaleel Ahmed  🥎"," ✈️ Noor Ahmad🥎"};
        String[] dcsquad={"  K L Rahul 🏏🧤","  Abishek Porel 🏏🧤"," ✈️ Faf Du Plessis 🏏"," Ashutosh Sharma 🏏"," ✈️ Jake Fraser 🏏"," Manvanth Kumar 🥎🏏"," Axar Patel (c)🏏🥎","Kuldeep Yadav 🥎"," ✈️ Mitchell Starc 🥎"," Mukesh Kumar 🥎"," Mohit Sharma 🥎"," Madhav Tiwari  🥎"," T Natarajan 🥎"};
        String[] lsgsquad={"  Rishabh Pant (c) 🏏🧤","  Ayush Badoni 🏏"," ✈️ David Miller 🏏"," ✈️ Nicholas Pooran 🏏"," ✈️ Aiden Markram 🏏"," ✈️ Mitchell Marsh 🥎🏏"," Abdul Samad🏏🥎"," Ravi Bishnoi 🥎"," ✈️ Shamar Joseph 🥎","  Shardul Thakur 🥎"," Prince Yadav 🥎"," Akash Deep 🥎"," Akash Singh 🥎"};
        String[] pkbquad={" ✈️ Josh Inglis 🏏🧤","  Shreyas Iyer (c) 🏏"," Harnoor Pannu 🏏"," Shashank Singh 🏏🥎"," ✈️ Glenn Maxwell 🏏🥎"," ✈️ Marco Jansen 🥎🏏"," Nehal Wadhera 🏏🥎"," Arshdeep Singh 🥎"," ✈️ Lockie Ferguson 🥎","  Yuzvendra Chahal 🥎"," Yash Thakur 🥎"," Kuldeep Sen 🥎"," Pravin Dubey 🥎"};
        String[] gtsquad={" ✈️ Jos Buttler 🏏🧤","  Shubman Gill (c) 🏏"," Shahrukh Khan 🏏"," Sai Sudharsan 🏏"," Rahul Tewatia 🏏🥎"," ✈️ Sherfane Rutherford 🏏"," ✈️ Karim Janat 🥎🏏"," Washington Sundar 🏏🥎"," Ishant Sharma 🥎"," ✈️ Kagiso Rabada 🥎","  Mohammed Siraj 🥎"," Sai Kishore 🥎"," Prasidh Krishna 🥎"};
        String[] rrsquad={" Sanju Samson (c) 🏏🧤"," Nitish Rana 🏏"," Yashasvi Jaiswal 🏏"," Dhruv Jurel 🏏"," Riyan Parag 🏏🥎"," ✈️ Shimron Hetmyer 🏏"," ✈️ Wanindu Hasaranga 🥎🏏"," Ashok Sharma 🏏🥎"," Sandeep Sharma 🥎"," ✈️ Jofra Archer 🥎"," Tushar Deshpande 🥎"," ✈️ Maheesh Theekshana 🥎"," Akash Madhwal 🥎"};

        switch (squadno)
        {

            case 11:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        KKR                vs                 RCB");
                System.out.println("( Kolkata Knight Riders )       (Royal Challenge Bangalore)");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(kkrsquad[i]+"                  " +rcbsquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 22:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH              vs           RR");
                System.out.println("( Sunrises Hyderabad )       (Rajasthan Royals)");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(srhsquad[i]+"                  " +rrsquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");
            }
            break;
            case 33:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        MI           vs           CSK");
                System.out.println("( Mumbai Indians )       ( Chennai Super Kings )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(misquad[i]+"               " +csksquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 44:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        LSG               vs           DC");
                System.out.println("( Lucknow Super Giants )       ( Delhi Capital )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(lsgsquad[i]+"                  " +dcsquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");
            }
            break;
            case 55:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        PBKS             vs              GT");
                System.out.println("( Punjab Kings 11 )             ( Gujarat Titans )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(pkbquad[i]+"              " +gtsquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 66:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        RR               vs        KKR");
                System.out.println("( Rajasthan Royals )       ( Kolkata Knight Riders )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(rrsquad[i]+"                  " +kkrsquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 77:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH              vs             LSG");
                System.out.println("( Sunrises Hyderabad )       ( Lucknow Super Giants )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(srhsquad[i]+"                  " +lsgsquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 88:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        RCB                       vs             CSK");
                System.out.println("( Royal Challengers Bangalore )       ( Chennai Super Kings )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(rcbsquad[i]+"                  " +csksquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 99:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        GT          vs            MI");
                System.out.println("( Gujarat Titans )       ( Mumbai Indians )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(gtsquad[i]+"                  " +misquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 110:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH             vs             DC");
                System.out.println("( Sunrises Hyderabad )       ( Delhi Capital )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(srhsquad[i]+"                  " +dcsquad[i]);

                System.out.println("============================================================");
                System.out.println("Press 99 For Buy Ticket For This Match");
                System.out.println("Press 100 To Cancel Transaction");
                //return Integer.parseInt(user.nextLine());
                System.out.println("\n");
                int ticketrequest = Integer.parseInt(user.nextLine());
                if (ticketrequest==99)
                {
                    new Ipl().ticketdetails();
                }
                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }

            default:
                System.out.println("Enter Correct Option (default squad)");
        }

    }
    private void previewsquad( int squadno)  // return 99 for tkt
    {

        String kkrsquad[]={"Ajinkya Rahane (C) 🏏","Angkrish Ranghuvanshi 🏏","✈️ Quinton De Kock 🧤","✈️ Andre Russell 🏏🥎","✈️ Sunil Narine 🏏🥎", "Rinku Singh 🏏", "Manish Pandey 🏏","✈️ Rovman Powell 🏏","Harshit Rana 🥎"," Varun Chakaravarthy 🥎","✈️ Anrich Nortje 🥎  " };
        String rcbsquad[]={"  Virat Kohli 🏏","Rajat Patidar (c)🏏","✈️ Phil Salt 🧤","  Devdutta Padikkal 🏏","✈️ Liam Livingstone 🏏🥎"," Krunal Pandya 🏏🥎"," ✈️ Tim David 🏏🥎"," Bhuvneshwar Kumar 🥎"," ✈️ Romario Shepherd 🥎"," Yash Dayal 🥎"," Suyash Sharma 🥎"};
        String[] srhsquad={"  Aniket Verma 🏏"," ✈️ Travis Head 🏏"," Ishan Kishan 🧤","  Abhinav Manohar 🏏"," ✈️ Heinrich Klaasen 🏏🧤","Abhishek Sharma 🏏🥎"," Nitish Kumar Reddy 🏏🥎"," ✈️ Pat Cummins (c) 🥎","    Bhuvneshwar Kumar 🥎"," Harshal Patel 🥎","Mohammad Shami 🥎"," Rahul Chahar 🥎"};
        String[] misquad={" Rohit Sharma 🏏"," ✈️ Will Jacks 🏏"," ✈️ Ryan Rickelton 🧤","  N Tilak Varma 🏏"," Surya Kumar Yadav 🏏"," Hardik Pandya (c)🏏🥎"," Corbin Bosch 🥎"," ✈️ Trent Boult 🥎","Vignesh Puthur 🥎","Deepak Chahar 🥎","Jasprit Bumrah 🥎"," Karn Sharma 🥎"};
        String[] csksquad={" MS Dhoni 🏏🧤"," ✈️ Rachin Ravindra 🏏"," Ruturaj Gaikwad (c) 🧤"," Rahul Tripathi 🏏"," Devon Conway 🏏"," Shivam Dube🏏🥎"," Ravindra Jadeja 🥎"," ✈️ Sam Curran 🏏🥎","Ravichandran Ashwin 🏏🥎"," ✈️ Matheesha Pathirana 🥎"," Khaleel Ahmed  🥎"," ✈️ Noor Ahmad🥎"};
        String[] dcsquad={"  K L Rahul 🏏🧤","  Abishek Porel 🏏🧤"," ✈️ Faf Du Plessis 🏏"," Ashutosh Sharma 🏏"," ✈️ Jake Fraser 🏏"," Manvanth Kumar 🥎🏏"," Axar Patel (c)🏏🥎","Kuldeep Yadav 🥎"," ✈️ Mitchell Starc 🥎"," Mukesh Kumar 🥎"," Mohit Sharma 🥎"," Madhav Tiwari  🥎"," T Natarajan 🥎"};
        String[] lsgsquad={"  Rishabh Pant (c) 🏏🧤","  Ayush Badoni 🏏"," ✈️ David Miller 🏏"," ✈️ Nicholas Pooran 🏏"," ✈️ Aiden Markram 🏏"," ✈️ Mitchell Marsh 🥎🏏"," Abdul Samad🏏🥎"," Ravi Bishnoi 🥎"," ✈️ Shamar Joseph 🥎","  Shardul Thakur 🥎"," Prince Yadav 🥎"," Akash Deep 🥎"," Akash Singh 🥎"};
        String[] pkbquad={" ✈️ Josh Inglis 🏏🧤","  Shreyas Iyer (c) 🏏"," Harnoor Pannu 🏏"," Shashank Singh 🏏🥎"," ✈️ Glenn Maxwell 🏏🥎"," ✈️ Marco Jansen 🥎🏏"," Nehal Wadhera 🏏🥎"," Arshdeep Singh 🥎"," ✈️ Lockie Ferguson 🥎","  Yuzvendra Chahal 🥎"," Yash Thakur 🥎"," Kuldeep Sen 🥎"," Pravin Dubey 🥎"};
        String[] gtsquad={" ✈️ Jos Buttler 🏏🧤","  Shubman Gill (c) 🏏"," Shahrukh Khan 🏏"," Sai Sudharsan 🏏"," Rahul Tewatia 🏏🥎"," ✈️ Sherfane Rutherford 🏏"," ✈️ Karim Janat 🥎🏏"," Washington Sundar 🏏🥎"," Ishant Sharma 🥎"," ✈️ Kagiso Rabada 🥎","  Mohammed Siraj 🥎"," Sai Kishore 🥎"," Prasidh Krishna 🥎"};
        String[] rrsquad={" Sanju Samson (c) 🏏🧤"," Nitish Rana 🏏"," Yashasvi Jaiswal 🏏"," Dhruv Jurel 🏏"," Riyan Parag 🏏🥎"," ✈️ Shimron Hetmyer 🏏"," ✈️ Wanindu Hasaranga 🥎🏏"," Ashok Sharma 🏏🥎"," Sandeep Sharma 🥎"," ✈️ Jofra Archer 🥎"," Tushar Deshpande 🥎"," ✈️ Maheesh Theekshana 🥎"," Akash Madhwal 🥎"};

        switch (squadno)
        {

            case 11:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        KKR                vs                 RCB");
                System.out.println("( Kolkata Knight Riders )       (Royal Challenge Bangalore)");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(kkrsquad[i]+"                  " +rcbsquad[i]);

                System.out.println("============================================================");


                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 22:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH              vs           RR");
                System.out.println("( Sunrises Hyderabad )       (Rajasthan Royals)");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(srhsquad[i]+"                  " +rrsquad[i]);

                System.out.println("============================================================");


                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");
            }
            break;
            case 33:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        MI           vs           CSK");
                System.out.println("( Mumbai Indians )       ( Chennai Super Kings )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(misquad[i]+"               " +csksquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 44:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        LSG               vs           DC");
                System.out.println("( Lucknow Super Giants )       ( Delhi Capital )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(lsgsquad[i]+"                  " +dcsquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");
            }
            break;
            case 55:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        PBKS             vs              GT");
                System.out.println("( Punjab Kings 11 )             ( Gujarat Titans )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(pkbquad[i]+"              " +gtsquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 66:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        RR               vs        KKR");
                System.out.println("( Rajasthan Royals )       ( Kolkata Knight Riders )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(rrsquad[i]+"                  " +kkrsquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 77:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH              vs             LSG");
                System.out.println("( Sunrises Hyderabad )       ( Lucknow Super Giants )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(srhsquad[i]+"                  " +lsgsquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 88:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        RCB                       vs             CSK");
                System.out.println("( Royal Challengers Bangalore )       ( Chennai Super Kings )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(rcbsquad[i]+"                  " +csksquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 99:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        GT          vs            MI");
                System.out.println("( Gujarat Titans )       ( Mumbai Indians )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(gtsquad[i]+"                  " +misquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }
            break;
            case 110:
            {
                System.out.println("---------------------> Squad Info <-----------------------");
                System.out.println("==========================================================");
                System.out.println("        SRH             vs             DC");
                System.out.println("( Sunrises Hyderabad )       ( Delhi Capital )");

                for (int i=0;i<= kkrsquad.length-1;i++)
                    System.out.println(srhsquad[i]+"                  " +dcsquad[i]);

                System.out.println("============================================================");

                System.out.println("\nEnjoy Your Moment With Cricket");
                System.out.println("\n 😍  THANK YOU  😍");

            }

            default:
                System.out.println("Enter Correct Option (default squad)");
        }

    }

    private void ticketdetails()
    {
        System.out.println("How Many Ticket you need  ");

        String[] ticket =new String[Integer.parseInt(user.nextLine())];

        System.out.println("Enter "+ticket.length+" Person Names ");
        //System.out.println(ticket.length);

        for (int i=0;i<=ticket.length-1;i++)
        {
            ticket[i]=user.nextLine();
        }
       // System.out.println(Arrays.toString(ticket));

        System.out.println("Select Your Pavilion ");
        System.out.println("Ticket Price Are \u20B9 "+a_btktprice+" Onwards For A - B Pavilion");
        System.out.println("Ticket Price Are \u20B9 "+c_dtktprice+" Onwards For C  - D Pavilion");
        System.out.println("Ticket Price Are \u20B9 "+e_ftktprice+" Onwards For E - F Pavilion");

        String pavilion=user.nextLine();
        System.out.println("Enter Seat Number Between 1 to 100");
        int seatnumber=user.nextInt();

//        if (pavilion.equals("A"))
//            System.out.println("Your Total Ticket Price \u20B9"+a_btktprice*(ticket.length));

        switch (pavilion)
        {
            case "a","A","b","B":
            {
                System.out.println("=====================💸💸💸====================");
                System.out.println("Your Total Ticket Price \u20B9 " + a_btktprice * (ticket.length));
                System.out.println("=====================💸💸💸====================");
            }
            break;

            case "c","C","d","D" :
            {
                System.out.println("=====================💸💸💸====================");
                System.out.println("Your Total Ticket Price \u20B9 " + c_dtktprice * (ticket.length));
                System.out.println("=====================💸💸💸====================");
            }
            break;

            case "e","E","f","F":
            {
                System.out.println("<==============💸💸💸===============+>");
                System.out.println("\nYour Total Ticket Price \u20B9 "+e_ftktprice*(ticket.length));
                System.out.println("\n<==============💸💸💸================>");
            }
            break;
            default:
                System.out.println("Select Correct Pavilion");
        }

        System.out.println("\nYour Ticket Details Will Show Below");
        System.out.println("-------------------------------------");
        System.out.println("\n🎫🎫 ========================= 🎫🎫");
        int count=1;
        for (String names :ticket)
            System.out.println(count++ +". For "+names+" Seat Number is "+pavilion+" "+seatnumber++ );
        System.out.println("🎫🎫 ========================= 🎫🎫");

    }

  // Branch Method For this program !!!

    void meth1()
    {
        System.out.println(" 1. Buy Ticket");
        System.out.println(" 2. Only Preview The IPL 2025 ");
        System.out.println("🔥 Plz Choose an Option 🔥 ");
        int fstoption=user.nextInt();
        
        if (fstoption==1)
        {
            int secoption = new Ipl().second();
            
            if (secoption>0 && secoption <4)
            {
                switch (secoption)
                {
                    case 1:
                    {

                        int matchn2=new Ipl().upcoming(); //Store Upcoming Return Value
                        System.out.println(matchn2);

                        int squadreference=new Ipl().matchinfo1(matchn2);
                        new Ipl().squadinfo(squadreference);

                    }
                    break;
                }
                
            }
            else
                System.out.println("Plz Select Correct Option");
        }
        else if (fstoption==2)
        {
            int matchn2=new Ipl().upcoming(); //Store Upcoming Return Value
            System.out.println(matchn2);

            int squadreference=new Ipl().matchinfo1(matchn2);
            new Ipl().previewsquad(squadreference);
        }
        else
            System.out.println("Hey Buddy Choose Correct Option");

    }



    public static void main(String[] args)
    {
        System.out.println(" ❤️🏏 Welcome To IPL 2025 ❤️🏏");
        System.out.println("=================================");
        Ipl obj=new Ipl();
        obj.meth1();
//        obj.ticketdetails();
       //int result= obj.matchinfo();
        //System.out.println(result);
//        new Ipl().matchinfo1(80);


    }
}
