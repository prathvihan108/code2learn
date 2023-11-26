

public class J11 {
    public static void main(String[] args) {
        String name = "Harry";
        // System.out.println(name);
        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();  //Returns lower case of  name and stores in lstring
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();//Returns upper case of  name and stores in ustring
        //System.out.println(ustring);

        //String nonTrimmedString = "     Harry     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();//Removes all spaces and then returns
        //System.out.println(trimmedString);

        //System.out.println(name.substring(1)); //Substring includes from index one to (last-1) index
        //System.out.println(name.substring(1,5));//Substrin includes from index one to index 4

        //System.out.println(name.replace('r', 'p')); //r is replaced with p every occurence
        //System.out.println(name.replace("r", "ier")); // ""

        //System.out.println(name.startsWith("Har")); Returns true if String Starts with Har
        //System.out.println(name.endsWith("dd"));

        //System.out.println(name.charAt(4)); //prints character at index 4

        String modifiedName = "Harryrryrry";
        //System.out.println(modifiedName.indexOf("rry"));
        //System.out.println(modifiedName.indexOf("rry", 4)); Sarts searching for "rry" from index 4 to last idex
        System.out.println(modifiedName.lastIndexOf("rry", 7)); //lastIndexOf searches from backwords and again we are asking it to search from index 7 back words so it will return index 5

        //System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence\ttab \"double quote");//Esacpe sequences




    }
}
