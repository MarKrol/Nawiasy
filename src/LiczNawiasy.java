public class LiczNawiasy {

    public int Licz(String s){
        int liczright = 0;
        for(int i=s.length(); i>0; i--){
            if (s.charAt(i-1) == ')'){
                liczright++;
            } else {
                if ((s.charAt(i-1)=='(')){
                    liczright--;
                }
             if (liczright < 0) {break;}
            }
        }
        return liczright;
    }
}
