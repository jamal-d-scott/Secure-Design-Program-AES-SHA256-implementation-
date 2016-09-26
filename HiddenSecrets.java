import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HiddenSecrets 
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		String[][][] secrets =
		{
		   {
		      {"guest", "password", "You’re on your way to becoming a 1337h4x0r. Congrats no0bz rofc0ptorz."},
		      {"divinss", "!\"#$%..>1HL7G]\"x$6(;oJ\\gv", "I would rather be a brainless monkey than a heartless monster."},
		      {"gallopd", "!\"#$%pJKSXau-6(Vr+L9\\xm/\"", "There's only one certainty in life. A strong man stands above and conquers all!"},
		      {"hartranfte", "!\"#$%\\f;LY_7I|dyIfEW*FZb`", "This doesn't concern you! This is between me and your circus clown of a father!"},
		      {"iacobaccia", "!\"#$%[~DQXlNsYq{pcPi)*:gx", "My, he's not much of a conversationalist. Are you mad because I didn't knock?"},
		      {"kenneyw", "!\"#$%j/^+ds0exir{*wzgf3H/", "Eternal Dragon, by your name, I summon you forth, Shenron."},
		      {"lefeverb", "!\"#$%)gHIjoSYp}`uKsN#:33a", "Fool! Never believe anything the enemy tells you!"},
		      {"levineb", "!\"#$%HUX1BMPOn-BanGZ/t5tY", "As long as I have the power to destroy you, I'm willing to sacrifice everything."},
		      {"manningd", "!\"#$%K/ziH%{Mfa^1g#bAr?_Q", "Your real strength is your bravery."},
		      {"mirandat", "!\"#$%(@R_hf/_o^jv*J{s^4o6", "Are you ready now to witness a power not seen for thousands of years?"},
		      {"schubertr", "!\"#$%d.GiKOtb4O/4zs8^*@$m", "We can't give up just because things aren't the way we want them to be."},
		      {"schulteiss", "!\"#$%gMr!|g[g@!l{/'~UNYMI", "The chamber is dead, and so are you if you don't tell me that password!"},
		      {"weisk,", "!\"#$%#3ZNRS`8d*.K_RU9HBo/","I refuse to tolerate: cowardice, bad haircuts, and millitary insurrection."},
		      {"wittmanb", "!\"#$%vL+[L_My2(,^1:U2x7AD", "Let me ask you. Does a machine like yourself ever experience fear."}
		   }
		};
		
		//Encrypts the messages
		for(int i = 0; i < 14; i++)
		{
			byte[] message = secrets[0][i][2].getBytes();
			byte[] key = getKey(secrets[0][i][1]);
			byte[] encrypted = AES.encrypt(message, key);
			secrets[0][i][2] = AES.toHexString(encrypted);
		}
		
		//Hashes pws
		for(int i = 0; i < 14; i++)
		{
			secrets[0][i][1] = SHA256.Hash(secrets[0][i][1]);
		}
		
		PrintWriter protectedFile = new PrintWriter("Secrets.txt", "UTF-8");
		for(int i = 0; i < 14; i++)
		{
			for(int j = 0; j <=2; j++)
			{
				protectedFile.print(secrets[0][i][j]+" ");
			}
			protectedFile.println("");
		}
		protectedFile.close();
		
		System.out.println("Complilation complete, see: 'Secrets.txt'");
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
