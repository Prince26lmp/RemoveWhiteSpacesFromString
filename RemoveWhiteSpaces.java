package JavaDSA;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Jav a Pro gr amm ing Lan gua ge   See ms T o B e Ver y  E as y";
		System.out.println("Before Removing The White-Spaces::" +str);
        str=str.replaceAll("\\s", "");
        System.out.println("After Removing The White-Spaces::" +str);
	}

}
