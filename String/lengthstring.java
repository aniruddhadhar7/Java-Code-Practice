class lengthstring{
    public static void main(String[] args) {
        String s="Aniruddha";
        char a[]=s.toCharArray();
        //System.out.println(a.length);
        int count=0;
        for(char c:a){
            count++;
        }
        System.err.println(count);
    }
}