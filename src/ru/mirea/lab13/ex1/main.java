package ru.mirea.lab13.ex1;

public class main {
    public static void main(String[] args){
        String strok = "I like Java!!!";
        // 2
        System.out.println("Последний символ строки: "+strok.charAt(strok.length()-1));
        //3
        System.out.println("Заканчивается ли строка подстрокой \"!!!\": " + strok.endsWith("!!!"));
        // 4
        System.out.println("Начинается ли строка подстрокой \"I like\": " + strok.startsWith("I like"));
        // 5
        System.out.println("Содержит ли строка подстроку:" + strok.contains("Java"));
        // 6
        int x = strok.indexOf("Java");
        System.out.println("Позиция строки Java в строке: " + x);
        //7
        System.out.println("Замена всех символов 'a' на 'o': " + strok.replace('a','o'));

        /*public String replace(char oldChar, char newChar) {
            if (oldChar != newChar) {
                String ret = isLatin1() ? StringLatin1.replace(value, oldChar, newChar)
                        : StringUTF16.replace(value, oldChar, newChar);

                проверка кодировки

                if (ret != null) {
                    return ret;
                }
            }
            return this;
        }*/

        // 8
        System.out.println("Строка в верхнем регистре:"+strok.toUpperCase());
        // 9
        System.out.println("Строка в нижнем регистре:"+strok.toLowerCase());
        // 10
        System.out.println("Вырезка строки:" + strok.substring(x,x+"Java".length()));
        /*
        public String substring(int beginIndex, int endIndex) {
            int length = length();
            checkBoundsBeginEnd(beginIndex, endIndex, length);
            if (beginIndex == 0 && endIndex == length) {
                return this;
            }
            int subLen = endIndex - beginIndex;
            return isLatin1() ? StringLatin1.newString(value, beginIndex, subLen)
                    : StringUTF16.newString(value, beginIndex, subLen);

        }*/
    }
}
