public class J34 {
    public static void main(String[] args) {
        // Initialization
        String str = "Hello, World!";
        String anotherString = " How are you?";
        String stringWithSpaces = "   Trim me!   ";

        // length()
        int length = str.length();
        System.out.println("Length: " + length);

        // charAt(int index)
        char character = str.charAt(7);
        System.out.println("Character at index 7: " + character);

        // substring(int beginIndex)
        String substring = str.substring(7); //substring is overloaded it can take one also or 2 also
        System.out.println("Substring from index 7: " + substring);

        // substring(int beginIndex, int endIndex)
        String subStringRange = str.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + subStringRange);

        // toUpperCase()
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // toLowerCase()
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // replace(char oldChar, char newChar)
        String replacedString = str.replace('o', 'x');
        System.out.println("String after replacement: " + replacedString);

        // replaceAll(String regex, String replacement)
        String regexReplaced = str.replaceAll("o", "x");
        System.out.println("String after regex replacement: " + regexReplaced);

        // concat(String str)
        String concatenatedString = str.concat(anotherString);
        System.out.println("Concatenated String: " + concatenatedString);

        // startsWith(String prefix) and endsWith(String suffix)
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'World!': " + endsWithWorld);

        // contains(CharSequence sequence)
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // trim()
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");

        // repeat(int count) (Java 11 and later)
        String repeatedString = "abc".repeat(3);
        System.out.println("Repeated String: " + repeatedString);

        // indent() (Java 12 and later)
        String indentedString = "Indented".indent(3);
        System.out.println("Indented String:\n" + indentedString);
    }
}
