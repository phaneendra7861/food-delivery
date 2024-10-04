import java.util.*;
import java.util.regex.*;
//----------------------------------------------------------------------------------
class Fooddelivery extends Login
{	
	static Fooddelivery obj1 =new Fooddelivery();
	
	
    public static void main(String[] args) 
	{
		String image = "\t"+co.BRIGHT_MAGENTA_TEXT+"  __      \n"
                      + "\to'')}____//\n"
                      + "\t `_/      )\n"
                      + "\t (_(_/-(_/ "+co.RESET;
        
        System.out.println(image);
		System.out.println("\n"+co.BLINK+co.BRIGHT_BLUE_TEXT+co.REVERSE+"  WELCOME TO FOOD DELIVERY SERVICE  "+co.RESET);
		System.out.println("________________________");
        System.out.println(co.BRIGHT_WHITE_TEXT+"\n\t1.Register");
		System.out.println("\n\t2.Login");
		System.out.println("\n\t3.Exit"+co.RESET);
		System.out.println("________________________\n\t");
		int log = sc.nextInt();
		switch(log)
		{
			case 1:
				obj1.Register();
				break;
			case 2:
				
				Login.Flogin();
				break;
			case 3:
				break;
			default:
				System.out.println(co.RED_TEXT+"\nPlease enter correct input"+co.RESET);
				main(args);
		}
		
    }
}

class co 
{
    // Text color
    public static final String BLACK_TEXT = "\033[30m";
    public static final String RED_TEXT = "\033[31m";
    public static final String GREEN_TEXT = "\033[32m";
    public static final String YELLOW_TEXT = "\033[33m";
    public static final String BLUE_TEXT = "\033[34m";
    public static final String MAGENTA_TEXT = "\033[35m";
    public static final String CYAN_TEXT = "\033[36m";
    public static final String WHITE_TEXT = "\033[37m";

    // Bright text color
    public static final String BRIGHT_BLACK_TEXT = "\033[90m";
    public static final String BRIGHT_RED_TEXT = "\033[91m";
    public static final String BRIGHT_GREEN_TEXT = "\033[92m";
    public static final String BRIGHT_YELLOW_TEXT = "\033[93m";
    public static final String BRIGHT_BLUE_TEXT = "\033[94m";
    public static final String BRIGHT_MAGENTA_TEXT = "\033[95m";
    public static final String BRIGHT_CYAN_TEXT = "\033[96m";
    public static final String BRIGHT_WHITE_TEXT = "\033[97m";

    // Background color
    public static final String BLACK_BACKGROUND = "\033[40m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String MAGENTA_BACKGROUND = "\033[45m";
    public static final String CYAN_BACKGROUND = "\033[46m";
    public static final String WHITE_BACKGROUND = "\033[47m";

    // Bright background color
    public static final String BRIGHT_BLACK_BACKGROUND = "\033[100m";
    public static final String BRIGHT_RED_BACKGROUND = "\033[101m";
    public static final String BRIGHT_GREEN_BACKGROUND = "\033[102m";
    public static final String BRIGHT_YELLOW_BACKGROUND = "\033[103m";
    public static final String BRIGHT_BLUE_BACKGROUND = "\033[104m";
    public static final String BRIGHT_MAGENTA_BACKGROUND = "\033[105m";
    public static final String BRIGHT_CYAN_BACKGROUND = "\033[106m";
    public static final String BRIGHT_WHITE_BACKGROUND = "\033[107m";

    // Reset
	public static final String BOLD = "\u001B[1m";
    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BLINK = "\u001B[5m";
    public static final String REVERSE = "\u001B[7m";
    public static final String RESET = "\033[0m";
}



//------------------register class----------------------------------------------------------------
class Register
{
    private static String USERNAME="reva@gmail.com";
    private static String PASSWORD="Rkn@12345";
	
	void setDetails(String name,String pass)
	{
		this.USERNAME=name;
		this.PASSWORD=pass;
	}
	void setFpass(String Fpass)
	{
		this.PASSWORD=Fpass;
	}
	String getUSERNAME()
	{
		return USERNAME;
	}
	
	String getPASSWORD()
	{
		return PASSWORD;
	}
}




//---------------------------login class ------------------------------------------------------
class Login
{	
	static Scanner sc = new Scanner(System.in);
	static Register obj = new Register();
	
	
	//********************* Register Method *******************************************
	static void Register()
	{
		System.out.println("________________________");
		System.out.println(co.RED_TEXT+"\nFooddelivery welcome's You"+co.RESET);
		System.out.println(co.GREEN_TEXT+"\nRegister Here"+co.RESET);
		System.out.println("________________________\n");
		System.out.print(co.YELLOW_TEXT+"\nEnter User_Mail : "+co.RESET);
		String takenUsername =sc.next();
		System.out.print(co.YELLOW_TEXT+"\nSet_password : "+co.RESET);
		String takenPassword = sc.next();
		validation(takenUsername,takenPassword);
		
		
		System.out.println("---------------------------------");
		System.out.println(co.GREEN_TEXT+"\nYou have Registered Successfully"+co.RESET);
		System.out.println("---------------------------------");
		System.out.print("\n");
		Login();
	}
	
	
	//****************** Login method ***********************************************
	static void Login()
	{
		System.out.println(co.RED_TEXT+"\nWelcome to The Fooddelivery"+co.RESET);
		System.out.println(co.GREEN_TEXT+"\nPlease Login Here "+co.RESET);
		System.out.print(co.YELLOW_TEXT+"\nEnter User Mail_ID: "+co.RESET);
		String enteredUsername = sc.next();
		System.out.print(co.YELLOW_TEXT+"\nEnter password: "+co.RESET);
		String enteredPassword = sc.next();
		if (isValidCredentials(enteredUsername,enteredPassword ))
		{
			System.out.println(co.GREEN_TEXT+"\nLogin successfull. Welcome, " + enteredUsername + "!"+co.RESET);
			Order obj2 = new Order();
			obj2.main1();
		} 
		else 
		{
			fdefault();
			
		}
	}
	
	//******************* direct login *******************************************
	static void Flogin()
	{
		System.out.print(co.CYAN_TEXT+"\nEnter User_Mail : "+co.RESET);
		String A_User = sc. next();
		System.out.print(co.CYAN_TEXT+"\nEnter_password : "+co.RESET);
		String A_Pass = sc.next();
		
		if(A_User.endsWith("@gmail.com")&&isValidPassword(A_Pass))
		{
			if (isValidCredentials(A_User,A_Pass))
			{
				
				System.out.println(co.GREEN_TEXT+"\nLogin successful. Welcome, " + A_User + "!"+co.RESET);
			Order obj2 = new Order();
			obj2.main1();
			}
			else{
				System.out.println(co.RED_TEXT+"\nYou Have Not Yet Registered"+co.RESET);
				System.out.println(co.RED_TEXT+"\nPlease Register"+co.RESET);
				Register();
			}
		}
		else 
		{
			System.out.println(co.MAGENTA_TEXT+"\nIncorrect Format, Please enter valid format"+co.RESET);
			Flogin();
		}
	}
	
	
	//******************** Validating method user name & password ****************************
	static boolean isValidCredentials(String username, String password) 
	{
        return username.equals(obj.getUSERNAME()) && password.equals(obj.getPASSWORD());
    }
	
	
	
	
	//****************** correct password format **********************************
	
	public static boolean isValidPassword(String password)
    {
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
	
	//********************* user i/p & o/p validation ************************************
	
	static void validation(String takenUsername,String takenPassword )
	{
		if(takenUsername.endsWith("@gmail.com")&&isValidPassword(takenPassword))
		{
			obj.setDetails(takenUsername,takenPassword);
		}
		else
		{
			System.out.println(co.RED_TEXT+"\nplease enter correct format"+co.RESET);
			Register();
		}
	}
	
	//******************* Forgot method **********************************************
	static void forgot()
	{
		String Fake = obj.getUSERNAME();
		System.out.print(co.CYAN_TEXT+"\nEnter User Mail_ID : "+co.RESET);
		String Fuser=sc.next();
		if(Fuser.equals(Fake))
		{
			System.out.print(co.MAGENTA_TEXT+"\nEnter New Password : "+co.RESET);
			String Npass=sc.next();
			obj.setFpass(Npass);
			Login();
		}
	}
	
	
	
	//******************* forgot default ************************************
	static void fdefault()
	{
		System.out.println(co.RED_TEXT+"\nInvalid credentials."+co.RESET);
		System.out.println(co.RED_TEXT+"\n1.Please Try again"+co.RESET);
		System.out.println(co.RED_TEXT+"\n2.Forgot Password"+co.RESET);
		System.out.println(co.YELLOW_TEXT+"\n3.Exit"+co.RESET);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
					Login();
					break;
			case 2:
					forgot();
					break;
			case 3:
					break;
			default:
					//System.out.print(co.RED_TEXT+"\nPlease enter valid option : "+co.RESET);
					fdefault();
		}
	}
}


//---------------------------------------------------------------------------------------------
// Restaurant file
//---------------------------------------------------------------------------------------------
class Order
{
	static Restaurant obj = new r1();
	static Restaurant2 obj1=new r2();
	public static void main1()
	{
		System.out.println("\nSelect a Restaurant");
		System.out.println(co.MAGENTA_TEXT+"\n1.Lucky Restaurant"+co.RESET);
		System.out.println(co.MAGENTA_TEXT+"\n2.Arun Restaurant"+co.RESET);
		System.out.println(co.YELLOW_TEXT+"\n3.Exit"+co.RESET);
		int n3=r1.sc.nextInt();
		switch(n3)
		{
			case 1 :
				obj.lucky();
				break;
			case 2 :
				obj1.arun();
				break;
			case 3 :
				break;
			default :
				System.out.println(co.RED_TEXT+"\nPlease enter valid option"+co.RESET);
				main1();
		}
	}
}



//--------------------abstract R classes ----------------------------------------------

abstract class Restaurant
{
	static Restaurant rest1 = new r1();
	abstract void lucky();
}
abstract class Restaurant2
{
	static Restaurant2 rest2 = new r2();
	abstract void arun();
}

//------------------------------- con R1 class --------------------------------------------
class r1 extends Restaurant
{
	
	static SBI objB1 = new SBI();
	static Scanner sc=new Scanner(System.in);
	static double bill=0;
	static double qut=0;
	static String dis =" ";
	
	//********************** bill method ********************************************
	static double Bill(double quantity,double price)
	{
		bill=bill+quantity*price;
		PPP(bill);
		return 0.0;
	}
	
	//********************** sub bill method ****************************************
	static void PPP(double bb)
	{
		System.out.println(co.MAGENTA_TEXT+"\n1.Order for more"+co.RESET);
		System.out.println(co.GREEN_TEXT+"\n2.go to payment"+co.RESET);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				
				rest1.lucky();
				break;
			case 2:
				System.out.println("------------------------CART------------------------");
				System.out.println(dis);
				System.out.println("----------------------------------------------------");
				System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\nYOUR BILL AMOUNT IS- "+bill+co.
				RESET);
				objB1.main2(bb);
				//Bank();
				break;
			default :
				System.out.println(co.RED_TEXT+"\nPlease Enter valid Option"+co.RESET);
				PPP(bb);
				break;
		}
	}
	
	//*************************** Lucky R method ************************************************
	void lucky()
	{
		System.out.println(co.RED_TEXT+"\npls select your preference"+co.RESET);
		System.out.println(co.GREEN_TEXT+"\n1.Veg Items"+co.RESET);
		System.out.println(co.GREEN_TEXT+"\n2.Non Veg Items"+co.RESET);
		int n=sc.nextInt();
		switch(n)
		{
			case 1 :
				System.out.println(co.CYAN_TEXT+"\nVeg Items"+co.RESET);
				Vegitems();
				break;
			case 2 :
				System.out.println(co.CYAN_TEXT+"\nNon-Veg Items"+co.RESET);
				Nonvegitems();
				break;
			default :
				System.out.println(co.RED_TEXT+"\nplease select valid option"+co.RESET);
				lucky();
		}
	} 
	
	//************************** L R V items method ********************************************
	static void Vegitems()
	{
		
		
		System.out.println(co.GREEN_TEXT+"\n1.Veg Starters"+co.RESET);
		System.out.println(co.GREEN_TEXT+"\n2.Veg Main course"+co.RESET);
		System.out.println(co.RED_TEXT+"\nPlease enter your preference"+co.RESET);
		int n1=sc.nextInt();
		switch(n1)
		{
		case 1 :
			LVstat();
			break;
		case 2 :
			LVmain();
			break;
		default :
			System.out.println(co.RED_TEXT+"\nitem not found please select valid option"+co.RESET);
			Vegitems();
		}
		
	}
	static void LVstat()
	{
		System.out.println("+++++++++++++++++++++++++++++ MENU ++++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_GREEN_BACKGROUND+co.BRIGHT_WHITE_TEXT+co.BLINK+"\n1.Babycorn Munchuria:\t99"+co.RESET);
		System.out.println(co.BRIGHT_GREEN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Veg Munchuria:\t99"+co.RESET);
		System.out.println(co.BRIGHT_GREEN_BACKGROUND+co.BRIGHT_WHITE_TEXT+co.BLINK+"\n3.Butten Naan:\t\t79"+co.RESET);
		System.out.println(co.BRIGHT_GREEN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.Paneer Tikka Masala:\t159"+co.RESET);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nBabycorn Munchuria\t99\tx  "+qut+"\t"+(qut*99)+"\n";
				Bill(qut,99);
				break;
			case 2:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nVeg Munchuria\t99\tx  "+qut+"\t"+(qut*99)+"\n";
				Bill(qut,99);
				break;
			case 3:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nButter Naan\t\t79\tx  "+qut+"\t"+(qut*79)+"\n";
				Bill(qut,79);
				break;
			case 4:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nPaneer Tikka Masala\t159\tx  "+qut+"\t"+(qut*159)+"\n";
				Bill(qut,159);
				break;
			default:
				System.out.println(co.RED_TEXT+"\nSelect valid option"+co.RESET);
				LVstat();
				
				break;
		}
	}
	static void LVmain()
	{
		System.out.println("++++++++++++++++++++++++++ MENU +++++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.Veg Biryani:\t\t129"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Veg Fried Rice:\t149"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n3.Paneer Biryani:\t199"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.Mushroom Biryani:\t199"+co.RESET);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n5=sc.nextInt();
		switch(n5)
		{
			case 1:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				 qut = sc.nextDouble();
				 dis = dis+"\nVeg Biryani\t\t129\tx  "+qut+"\t"+(qut*129)+"\n";
				Bill(qut,129);
				break;
			case 2:
				
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				 qut = sc.nextDouble();
				 dis = dis+"\nVeg Fried Rice\t149\tx  "+qut+"\t"+(qut*149)+"\n";
				Bill(qut,149);
				break;
			case 3:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				 qut = sc.nextDouble();
				 dis = dis+"\nPaneer Biryani\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill(qut,199);
				break;
			case 4:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nMushroom Biryani\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill(qut,199);
				break;
			default:
				System.out.println(co.RED_TEXT+"\nPlease Enter Valid Option"+co.RESET);
				LVmain();
				break;
		}
	}
	static void Nonvegitems()
	{
		System.out.println(co.BRIGHT_MAGENTA_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.Non-Veg Starters"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Non-Veg Main course"+co.RESET);
		int n2=sc.nextInt();
		switch(n2)
		{
			case 1:
				LNVstat();
				break;
			case 2:
				LNVmain();
				break;
			default:
				System.out.println(co.RED_TEXT+"\nItem not found please select valid option"+co.RESET);
				Nonvegitems();
				break;
		}
		
	}
	static void LNVmain()
	{
		System.out.println("+++++++++++++++++++++++++ MENU ++++++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.chicken biryani:\t\t199"+co.RESET);
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.mutton biryani:\t\t299"+co.RESET);
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n3.chicken lollipop biryani:\t249"+co.RESET);
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.fish pulusu:\t\t\t249"+co.RESET);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n4=sc.nextInt();
		switch(n4)
		{
			case 1:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nChicken Biryani\t\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill(qut,199);
				break;
			case 2:
				
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nMutton Biryani\t\t299\tx  "+qut+"\t"+(qut*299)+"\n";
				Bill(qut,299);
				break;
			case 3:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nChicken Lollipop Biryani\t249\tx  "+qut+"\t"+(qut*249)+"\n";
				Bill(qut,249);
				break;
			case 4:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis = dis+"\nFish Pulusu\t\t\t249\tx  "+qut+"\t"+(qut*249)+"\n";
				Bill(qut,249);
				break;
			default:
				System.out.println(co.RED_TEXT+"\nPlease Enter valid Option"+co.RESET);
				LNVmain();
				break;
		}
	}
	static void LNVstat()
	{	
		System.out.println("++++++++++++++++++++++++ MENU +++++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.Dragon Chicken:\t199"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Chicken 65:\t\t159"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n3.Apollo Fish:\t\t199"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.Mutton Fry:\t\t299"+co.RESET);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("\nEnter the Quantity");
				 qut = sc.nextDouble();
				 dis = dis+"\nDragon Chicken\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill(qut,199);
				break;
			case 2:
				
				System.out.println("\nEnter the Quantity");
				 qut = sc.nextDouble();
				 dis = dis+"\nChicken 65\t\t159\tx  "+qut+"\t"+(qut*159)+"\n";
				Bill(qut,159);
				break;
			case 3:
				System.out.println("\nEnter the Quantity");
				 qut = sc.nextDouble();
				 dis = dis+"\nApollo Fish\t\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill(qut,199);
				break;
			case 4:
				System.out.println("\nEnter the Quantity");
				 qut = sc.nextDouble();
				dis = dis+"\nMutton Fry\t\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill(qut,299);
				break;
			default:
				System.out.println("\nPlease Enter Valid Option");
				LNVstat();
				break;
		}
	}
}






class r2 extends Restaurant2
{
	
	static SBI objB = new SBI();
	static Scanner sc=new Scanner(System.in);
	static double bill2=0;
	static double qut=0;
	static String dis1 =" ";
	
	//**********************R-2 Bill ************************************
	static double Bill2(double quantity,double price)
	{
		bill2=bill2+quantity*price;
		PPP1(bill2);
		return 0.0;
	}
	
	//**********************R-2 Display & Payment************************************
	
	static void PPP1(double pp)
	{
		System.out.println("-------------------------CART--------------------------");
		System.out.println(dis1);
		System.out.println("-------------------------------------------------------");
		System.out.println("\n1.Order for more");
		System.out.println("\n2.go to payment");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				
				rest2.arun();
				break;
			case 2:
			
				System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\nYOUR BILL AMOUNT IS -" +bill2+co.RESET);
				objB.main2(pp);
				//Bank();
				break;
			default:
				PPP1(pp);
				break;
		}
	}
	
	//**********************R-2 Main Menu************************************
	
	void arun()
	{
		System.out.println("\npls select your preference");
		System.out.println("\n1.Veg Items");
		System.out.println("\n2.Non Veg Items");
		int n=sc.nextInt();
		switch(n)
		{
			case 1 :
				System.out.println("\nVeg Items");
				Vegitems();
				break;
			case 2 :
				System.out.println("\nNon-Veg Items");
				Nonvegitems();
				break;
			default :
				System.out.println("\nplease select valid option");
				arun();
		}
	} 

//_____________________R-2 Veg_______________________________________________________

	static void Vegitems()
	{
		
		
		System.out.println("\n1.Veg Starters");
		System.out.println("\n2.Veg Main course");
		System.out.println("\nPlease enter your preference");
		int n1=sc.nextInt();
		switch(n1)
		{
		case 1 :
			DVstat();
			break;
		case 2 :
			DVmain();
			break;
		default :
			System.out.println("\nitem not found please select valid option");
			Vegitems();
		}
	}
	
	//**********************R-2 Veg Main Menu************************************
	
	static void DVmain()
	{
		System.out.println("+++++++++++++++++++++++++++ MENU ++++++++++++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.Veg Biryani:\t229"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Veg Fried Rice:\t249"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n3.Paneer Biryani:\t299"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.Mushroom Biryani:\t299"+co.RESET);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n5=sc.nextInt();
		switch(n5)
		{
			case 1:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nVeg Biryani\t229\tx  "+qut+"\t"+(qut*229)+"\n";
				Bill2(qut,229);
				break;
			case 2:
				
				System.out.println("\nEnter the Quantity");
				 qut = sc.nextDouble();
				 dis1 = dis1+"\nVeg Fried Rice\t249\tx  "+qut+"\t"+(qut*249)+"\n";
				Bill2(qut,249);
				break;
			case 3:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nPanner Biryani\t299\tx  "+qut+"\t"+(qut*299)+"\n";
				Bill2(qut,299);
				break;
			case 4:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nMushroom Biryani\t299\tx  "+qut+"\t"+(qut*299)+"\n";
				Bill2(qut,299);
				break;
			default:
				DVmain();
				break;
		}
	}	
	
	//**********************R-2 Veg Stat Menu************************************
	
	static void DVstat()
	{
		System.out.println("++++++++++++++++++++++++++++++ MENU +++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.Babycorn Munchuria:\t199"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Veg Munchuria:\t199"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n3.Butter Naan:\t179"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.Paneer Tikka Masala:\t259"+co.RESET);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nBabycorn Munchuria\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill2(qut,199);
				break;
			case 2:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nVeg Munchuria\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill2(qut,199);
				break;
			case 3:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nButter Naan\t179\tx  "+qut+"\t"+(qut*179)+"\n";
				Bill2(qut,179);
				break;
			case 4:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nPaneer Tikka Masala\t259\tx  "+qut+"\t"+(qut*259)+"\n";
				Bill2(qut,259);
				break;
			default:
				DVstat();
				break;
		}
	}
	
//__________________R-2 Non Veg_____________________________________________________________

	static void Nonvegitems()
	{
		System.out.println("\n1.Non-Veg Starters");
		System.out.println("\n2.Non-Veg Main course");
		int n2=sc.nextInt();
		switch(n2)
		{
			case 1:
				DNVstat();
				break;
			case 2:
				DNVmain();
				break;
			default:
				System.out.println(co.RED_TEXT+"\nItem not found please select valid option"+co.RESET);
				Nonvegitems();
				break;
		}
		
		
	}
	
	//**********************R-2 Non Veg Main Menu************************************
	
	static void DNVmain()
	{
		System.out.println("++++++++++++++++++++++++++++++ MENU +++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.Chicken Biryani:\t299"+co.RESET);
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Mutton Biryani:\t499"+co.RESET);
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n3.Chicken Lollipop Biryani:\t299"+co.RESET);
		System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.Fish Pulusu:\t299"+co.RESET);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n4=sc.nextInt();
		switch(n4)
		{
			case 1:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis1 = dis1+"\nChicken Biryani\t299\tx  "+qut+"\t"+(qut*299)+"\n";
				Bill2(qut,299);
				break;
			case 2:
				
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis1 = dis1+"\nMutton Biryani\t499\tx  "+qut+"\t"+(qut*499)+"\n";
				Bill2(qut,499);
				break;
			case 3:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis1 = dis1+"\nChicken Lollipop Biryani\t299\tx  "+qut+"\t"+(qut*299)+"\n";
				Bill2(qut,299);
				break;
			case 4:
				System.out.println(co.GREEN_TEXT+"\nEnter the Quantity"+co.RESET);
				qut = sc.nextDouble();
				dis1 = dis1+"\nFish Pulusu\t299\tx  "+qut+"\t"+(qut*299)+"\n";
				Bill2(qut,299);
				break;
			default:
				System.out.println(co.RED_TEXT+"\nPlease Enter Valid Option "+co.RESET);
				DNVmain();
				break;
		}
	}
	
	//**********************R-2 Non Veg stat Menu************************************
	
	static void DNVstat()
	{
		System.out.println("+++++++++++++++++++++++++++ MENU +++++++++++++++++++++++++");
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n1.Dragan Chicken:\t199"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n2.Chicken 65:\t259"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n3.Apollo Fish:\t299"+co.RESET);
		System.out.println(co.BRIGHT_YELLOW_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n4.Mutton Fry:\t399"+co.RESET);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nDragon Chicken\t199\tx  "+qut+"\t"+(qut*199)+"\n";
				Bill2(qut,299);
				break;
			case 2:
				
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nChicken 65\t259\tx  "+qut+"\t"+(qut*259)+"\n";
				Bill2(qut,259);
				break;
			case 3:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nApollo Fish\t299\tx  "+qut+"\t"+(qut*299)+"\n";
				Bill2(qut,299);
				break;
			case 4:
				System.out.println("\nEnter the Quantity");
				qut = sc.nextDouble();
				dis1 = dis1+"\nMutton Fry\t399\tx  "+qut+"\t"+(qut*399)+"\n";
				Bill2(qut,399);
				break;
			default:
				System.out.println("\nPlease Enter Valid Option");
				DNVstat();
				break;
		}
	}
}




//--------------------------------------------------------------------------------------------------
//Bank file
//--------------------------------------------------------------------------------------------------


abstract class bank
{
	abstract void payment(long mobileNumber,double f);
	abstract void payment(String UPI,double f);
	
}
class SBI extends bank
{
	static double balance=10000;
	static Scanner sc=new Scanner(System.in);
	static int count(long n)
	{
		int c2=0;
		while(n>0)
		{
			n=n/10;
			c2++;
		}
		return c2;
	}
	static void withdraw(double f)
	{
		//System.out.println("\nEnter amount");
		double withdraw=f;//sc.nextDouble();
		
		if(balance>=withdraw)
		{
			balance=balance-withdraw;
			System.out.println("\n......................ORDERED SUCCESSFULLY.......................");
			System.out.println(co.BRIGHT_CYAN_BACKGROUND+co.BRIGHT_RED_TEXT+co.BLINK+"\n                 Available Balance "+balance+co.RESET);
		}
		else
		{
			System.out.println("\nInsufficient Balace");
		}
	}
	void payment(long mobileNumber,double f)
	{
		long l=mobileNumber;
		long rev=0;
		while(l>0)
		{
			rev=rev*10+l%10;
			l=l/10;
		}
		long r=rev%10;
		if(count(mobileNumber)==10)
		{
			if(r==6||r==7||r==8||r==9)
			{
				Pchk(f);
			}
			else
			{
				
				System.out.println("\npls Enterd Valid mobile number");
				payment(sc.nextLong(),f);
				
			}
		}
		else
		{
			System.out.println(co.RED_TEXT+"\nInvalid Mobile Number"+co.RESET);
			System.out.println(co.GREEN_TEXT+"\npls Enterd Valid mobile number"+co.RESET);
			payment(sc.nextLong(),f);
			
		}
        }
	void payment(String UPI,double f)
	{
		String i=UPI;
		if (isValid(i)) 
		{
			Pchk(f);
			
		}
		else 
		{
			System.out.println(co.GREEN_TEXT+"\npls entered valid UPI"+co.RESET);
			payment(sc.next(),f);
		}
	}
	void Pchk(double f)
	{
		System.out.println(co.RED_TEXT+"\nPIN MUST BE 4-DIGITS"+co.RESET);
		System.out.print("\nEnter pin : ");
		int pin2=sc.nextInt();
		if(count(pin2)==4)
		{
			withdraw(f);
		}
		else
		{
			System.out.println(co.RED_TEXT+"\nInvalid Pin..!"+co.RESET);
			System.out.println(co.YELLOW_TEXT+"\nPlease Try again"+co.RESET);
			Pchk(f);
		}
	}
	
	static void main2(double finalB)
	{
		SBI obj=new SBI();
		System.out.println(co.YELLOW_TEXT+"\npls choose any one option"+co.RESET);
		System.out.println(co.CYAN_TEXT+"\n1:for phone pe"+co.RESET);
		System.out.println(co.CYAN_TEXT+"\n2:for  UPI"+co.RESET);
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println(co.YELLOW_TEXT+"\npls enter your mobile Number"+co.RESET);
			obj.payment(sc.nextLong(),finalB);
			break;
		case 2:System.out.println(co.YELLOW_TEXT+"\npls enter UPI-ID"+co.RESET);
			obj.payment(sc.next(),finalB);
			break;
		default:
			System.out.println(co.RED_TEXT+"\npls chose Valid option"+co.RESET);
			main2(finalB);
			break;
		}
	}

//...................................................................................................................................................... 
  
 
    public static boolean isValid(String i) 
    { 
		String chk=i;
		int c=0;
		if(chk.endsWith("@ybl"))
			c=1;
		else if(chk.endsWith("@paytm"))
			c=1;
		else if(chk.endsWith("@upi"))
			c=1;
		if(c==1)
		return true;
		else
		return false;
    } 
}