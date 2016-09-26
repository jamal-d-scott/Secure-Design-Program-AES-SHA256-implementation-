import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Project3 
{
	public static int failedAttempts;
	public static String[][][] secrets =
		{
		   {
			   {"guest", "44d35883506d98cfa17ef096916722144de50ebf8aa83ca60472b5169f12140c", "9cc57c85580725403e717cc391c5ed863da1965959ca98affbbdb5afaa10a37e255ed1622c2e955a0df106edf8bcfcac02ea23bffef60f356daccbc406886d79714f96bc168a791a00837db995992aa6"}, 
			   {"divinss", "24a0ac9d53506788ef760c72825c2aac6cb52400496a67d685e63dd04d5989a3", "6b3f1f7dd2ba573ce30f760a6df15b86069ea3eefbfa84c8f77e97488ae12d9825676153c41956b38715138dc83571fb68839e5bf959ce094e8b932637530c33 "},
			   {"gallopd", "9c5c2634faa0bd65aeb1d4568fa272eef9ad52f6b674ba046afc20a6a52b2790", "c7aa063d46411f05593d5f52bb4ea0b0e4334d0d1499d9629ad4ec68b23f3edf98f4e2391278c4802423f7f2cdf57aefc062f8d34f98b51eead213a61cfd0de9a010ecf3976ae3a200ac67467c0896f5"}, 
			   {"hartranfte", "92d9fafb0be41c69e877402dff01ea48de3627e28963c4a5f82c0cbce9e46e8a", "0f583e1bb74487783f519ab89cf38b862bf1b96e3eb501172ab47021ec946e7db8f8152f75b5d5cd316efa604bbab91cfb1d1d19f1d10bb7cd4ea35853d0e38c11eb4a0212d734741fed98a9c8368b65"}, 
			   {"iacobaccia", "fed87f4fd51cfcdf93d021bf79e3ff477dc5973e341647870642098f02223563", "f1269af17e2cd230cd58d76699da5ca10d09c931292fd96f9e6f096dce4776e7d3dde20933ed8ca0235b7751009c2e722152c7782e82084a09f770821787ec76827b1f2ef2effe695d0abd41e95a13fb"}, 
			   {"kenneyw", "dbcfd8c87178a28def15bdce7667dda7ac6ef40c1a2ee4a804c4031f374ed9e6", "9d0bf01489921d6e9cbf5df0d95df9ae6c56c7089b5035b1acf6d7fc6a4ceee4f1f88d36babc1b2ee8a5b824c225e267df3213608f4a88338f6dcd10e5e89ea8"}, 
			   {"lefeverb", "2047d02969cde6023e9e18dbe241c4302629e5ab830e94ed08c4a5d18f299dfc", "49cab05a9f7edde200fe9b36511eda0b5d39ca18e50dda86ba5807fbfca7e059e526ce2bf45ce2346d58390ca97a5a8132276c41feb95e975e2705f1928468fe"}, 
			   {"levineb", "ae0fc4e4542a0a86f3b24c9a7f16058ad8d941b4959f65226ea33119613e1e74", "a0e1074e66e9e5436d7a905f24657d9f4481595e935dfa0e9626beb048e8ddd9ff190ec17c3ad0ba6698a35721a13436b9f582bfa44ce5dffa658ca272cf7b5cdcefc08027755fd8904de14ffe9b3fb7"}, 
			   {"manningd", "720bde912a3a85f2ac5236e2746dd16f157d7f5e574c97f6dda0ee459764303b", "01ab3ac09a0c8d4b2eb9a3d9c86ed5fdb3627f262c810f80a2c05875326e92251b16f8ce2097399c12f20b099631cf93"}, 
			   {"mirandat", "cb9b61e81823425f7b8c168882b9d3dd6ec7127a9feb2393383179effe027447", "2d77ce660c7f3fa8c8577776b2544034921686abd02636300eea3ece3fe8e1ea48bbf2312b6dee96efe27ad94f3c8937ee873c31b1c88cff5f032d884a6de22cf427b6424daece7b0a9169ebf48d5f19"}, 
			   {"schubertr", "286a89195a51cc7ebf8811b1efe14edbf38c2f57969e6a4e2c20c0249c3d7869", "d776aed37dd56d0b8cc3dc894b322128b4619c3b3e2782f82e4adb284d97f13e229cc427d4c0b7bd6d3f8d21450b66ecf86971dabd6d09cd5abeb1647a9fca17e6f12041218bf8830817127cec4d473d"}, 
			   {"schulteiss", "803d96b2b51da89f9a7d584c8127fbc5544159f6adafdd22efc33298470bdc69", "f252237fa45ddfe787a930cb3ae55dc607d6af1d7819ae8b414810aeafd1c733a1fd235ef9c3d9fb51ce01d428fa6437fca1c91acee6f23046f15053d9db774c08c1ead438bb770385f0f975a73498d6"}, 
			   {"weisk", "3727c48a04e0528749a079e96c562e0ab9663cc2241e74d0fc2fc9bb713eef75", "3a604e48d3544d5f784c842f61b0d664c3b1ab8e190cdf281a1bb109355776cc03f5c4653c50717a44e5460e220043240599bb47632838d6fb2ff2b79446c923cf9b27b86710767005f386bd0e186b35"}, 
			   {"wittmanb", "22df6511386b5ca52121e0a47d2af7af5e1667eb46fb777eda42133c2e36ffc1", "2f03d74a1ef3da6ba6ef189cca694c21ce404e42cacfc5c78a65ff5640278e7d5128baca7599225a907f0c142b5064c7a1c0090016911d5db42b14730c9c826395db3d2a813332ca24ff7e63a09fa526"} 
		   }
		};
	
	public static int[] success = new int[14];
	public static int[] fail = new int[14];
	
	public static void main(String[] args) 
	{		
		
		String message1 = "You’re on your way to becoming a 1337h4x0r. Congrats no0bz rofc0ptorz."; 
		
		byte[] message = message1.getBytes();
		byte[] key = getKey("password");
		byte[] encrypted = AES.encrypt(message, key);
		String enc = AES.toHexString(encrypted);
		System.out.println(enc);
		byte[] dec = AES.decrypt(enc.getBytes(),getKey("password"));
		System.out.println(AES.toHexString(dec));
		
		Arrays.fill(success, 0);
		Arrays.fill(fail, 0);
		failedAttempts = 0;

		Scanner in = new Scanner(System.in);
		
		String option;
		
		System.out.println("Enter 'T' to try to recover the hidden message: ");
		System.out.println("Enter 'V' view all attemps: ");
		System.out.println("Enter 'Q' to quit: ");
		option = in.nextLine();
		option = option.toUpperCase();
		while(!option.equals(""))
		{
			if(option.equals("T"))
			{
				login();
			}
			else if(option.equals("V"))
			{
				printAttempts();
			}
			else if(option.equals("Q"))
			{
				System.out.println("~ Another one bites the dust..");
				System.exit(0);
			}
			else
			{
				System.out.println("Not an option!");
			}
			System.out.println("\nEnter 'T' to try to recover the hidden message: ");
			System.out.println("Enter 'V' view all attemps: ");
			System.out.println("Enter 'Q' to quit: ");
			option = "";
			option = in.nextLine();
			option = option.toUpperCase();
		}
	}
	
	private static void login()
	{
		Scanner in = new Scanner(System.in);
		
		Map<String, Integer> Map = new HashMap<String, Integer>();
		for(int i = 0; i < 14; i++)
		{
			Map.put(secrets[0][i][0], Integer.valueOf(i));
		}
		
		boolean checkUser = false;
		boolean checkPass = false;
		String user = null;
		String pass;
		byte[] text;
		
		do
		{
			System.out.print("\nEnter username: ");
			user = in.nextLine();
			checkUser = checkUsername(user);
			if(checkUser == false)
			{
				System.out.println("Invalid username.");
			}
		} while(checkUser == false);

		do
		{
			System.out.print("Enter password: ");
			pass = in.nextLine();
			checkPass = checkPassword(pass);
			if(checkPass)
			{
				System.out.println("\nWell Done!");
				System.out.println("Username: "+ secrets[0][Map.get(user)][0]);
				text = AES.decrypt(secrets[0][Map.get(user)][2].getBytes(), getKey(pass));
				System.out.println("Message: "+ AES.toHexString(text));
				success[Map.get(user)]+=1;
			}
			else
			{
				System.out.println("Wrong Password.");
				failedAttempts++;
				fail[Map.get(user)]+=1;
				if(failedAttempts >= 5)
				{
					System.out.println("You have used up 5 attempts, please try again.");
					failedAttempts = 0;
					pass = "";
					return;
				}
			}
				
		} while(checkPass == false);
	}
	
	private static void printAttempts()
	{
		for(int i = 0; i < 14; i++)
		{
			System.out.printf("\n%s %3d %3d",secrets[0][i][0],success[i],fail[i]);
		}
	}
	
	private static boolean checkUsername(String userName)
	{
		for(int i = 0; i < 14; i++)
		{
			if(userName.equals(secrets[0][i][0]))
				return true;
		}
		return false;
	}
	
	private static boolean checkPassword(String password)
	{
		for(int i = 0; i < 14; i++)
		{
			if(SHA256.Hash(password).equals(secrets[0][i][1]))
				return true;
		}
		return false;
	}
	
	private static byte[] getKey(String password)
	{
		byte[] bytes = password.getBytes();
		byte[] key = new byte[128];
		
		for(int i = 0; i < 8; i++)
			key[i] = bytes[bytes.length - i - 1];
		return key;
	}
	
}
