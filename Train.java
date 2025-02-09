import java.util.Scanner;

// Pass = passenger details

class Pass{                                             
    String name;
    String email;
    int num;
    String gender;
    public Pass(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Data For User Log In");
        System.out.println("Enter your name : ");
        this.name=sc.nextLine();
        System.out.println("Enter your email : ");
        this.email=sc.nextLine();
        System.out.println("Enter your Gender : ");
        this.gender=sc.nextLine();
        System.out.println("Enter your num : ");
        this.num=sc.nextInt();
    }
}

// Dest = destination details   

class Dest{                                               
    String startingPoint;
    String endingPoint;
    int i,j;                                             
    String city[] = {"Rajkot","Dwarka","Ahemdabad","Surat","Porbandar","Anand","Gandhinagar","jamnagar","Somnath","Diu"};
    int distance[] ={0,280,490,310,550,330,230,710,620,900};
    double dist;
    public Dest(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting point : ");
        System.out.println("1-Rajkot    2-Dwarka\n3-Ahemdabad   4-Surat\n5-Porbandar    6-Anand\n7-Gandhinagar  8-Jamnagar\n9-Somanth    10-Diu");
        int s = sc.nextInt();
        System.out.println("Enter Ending point : ");
        System.out.println("1-Rajkot    2-Dwarka\n3-Ahemdabad   4-Surat\n5-Porbandar    6-Anand\n7-Gandhinagar  8-Jamnagar\n9-Somanth    10-Diu");
        int e = sc.nextInt();
        this.i = s-1;
        this.j = e-1;
        double dis = Math.abs(distance[this.j] - distance[this.i]);
        this.dist = dis;
    }
}

// Coaches = coaches Detailes

class Coaches {                                            
    String coach;
    int noOfSeat;
    public Coaches(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter S for - Sleeper (SL)\n Enter B for - 3 Tier AC (3A) \n Enter A for - 2 Tier AC (2A) \n Enter H for - 1st class AC (1A)");
        this.coach = sc.nextLine();
        System.out.println("Enter No. Of Passenger :");
        this.noOfSeat = sc.nextInt();
    }
}

//Main Class Train

public class Train{
    public static void main(String[] args){ 
        Scanner us=new Scanner(System.in);
        Pass p1=new Pass();
        Dest d1=new Dest();
        System.out.println(d1.dist+"Kilometer Your Journy Best Of Luck");
        Coaches c1 = new Coaches();
    }
}