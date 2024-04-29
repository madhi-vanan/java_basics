public class StrSrch {
    public static void main(String[] args) {
        String str="madhivanan";
        char target='i';
        System.out.println(Search5(str,target));
    }
static boolean Search(String str,char target){   // elements that are  performing shoulld be imported
    if(str.length()==0){             // we have to use .length() in string which is the default function in the string 
                                         //    ".length" is  used for variable in integer types 
     return false;
}
for (int i = 0; i < str.length(); i++) {
    if(target==str.charAt(i)){
        return true;
    }
}
return false;
}
static boolean Search2(String str,char target){   // elements that are  performing shoulld be imported
    if(str.length()==0){             // we have to use .length() in string which is the default function in the string 
                                         //    ".length" is  used for variable in integer types 
     return false;
}
for (int i = 0; i < str.length(); i++) {
    if(target==str.toCharArray(i)){
        return true;
    }
}
return false;
}
/**
 * @param str
 * @param target
 * @return
 */
static boolean Search3(String str,char target){   // elements that are  performing shoulld be imported
    if(str.length()==0){             // we have to use .length() in string which is the default function in the string 
                                         //    ".length" is  used for variable in integer types 
     return false;
}
for (char ch: str.toCharArray()) {
    if(target==ch){
        return true;
    }
}
return false;
}

static boolean Search4(String str, char target){
    if(str.length()==0){
        return false;
    }
     char[] arr=str.toCharArray();
      for(char c:arr){           // if this is working the wwhy previous fails
        if(c==target){
            return true;
        }
      }                                  //    while(str.toCharArray()==target){
                                        //        return true;
                                            //    }

    return false;
}
static boolean Search5(String str, char target){
    if(str.length()==0){
        return false;
    }
     char[] arr=str.toCharArray();
      for(int i=0;i<arr.length;i++){           // if this is working the wwhy previous fails
        if(arr[i]==target){
            return true;
        }
      }                                  //    while(str.toCharArray()==target){
                                        //        return true;
                                            //    }

    return false;
}

}
