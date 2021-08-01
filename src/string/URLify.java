package string;

//Write a method to replace all spaces in string witn '%20'
//assume the string has enough space to hold the additional chars in the end
//use char array
//example
//Input "mr john smith"
//Output is "john%20smith"
public class URLify {
    public static void main(String[] args) {
        char[] chars = "mr john smith".toCharArray();
        int numberSpaces = 0;
        for(int i=0; i<chars.length;i++){
            if(chars[i]==' '){
                numberSpaces++;
            }
        }
        char[] newInputChars = new char[chars.length+numberSpaces*2];
        for(int i=0; i<chars.length; i++){
            newInputChars[i] = chars[i];
        }
        String output = new String(urlify(newInputChars, chars.length));
        System.out.println(output);
    }
    public static char[] urlify(char[] chars, int length){
        for(int end=chars.length-1,last=length-1; last>=0; last--,end--){
            if (chars[last] == ' '){
                chars[end] = '0';
                chars[end-1] = '2';
                end = end - 2;
                chars[end] = '%';
            }else {
                chars[end] = chars[last];
            }
        }
        return chars;
    }
}
