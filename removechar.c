#include <stdio.h>
int main(){
char stringvalue[100], charToDelete;
scanf("%s ",&stringvalue);
scanf("%s ",&charToDelete);
int index=0,newindex=0;
while(stringvalue[index]!='\0'){
         if(stringvalue[index] !=charToDelete){
            stringvalue[newindex]=stringvalue[index];
            newindex++;
         }
         index++;
}
stringvalue[newindex]='\0';;
printf("%s",stringvalue);
return 0;
}