//FILE HANDILING IN C LANGUAGE BASIC FUNDA
/*
  >>creating arrays
  >>Creating pointers of type FILE
  >>fopen(file_namem,"mode") //Bring file to RAM
  >>perform operations such as fgetc(pointer_name).fputc('character'pointer_name),fgets(pointer_name),fputs("string"pointer_name)
 >>why filehandling:to store data from ram to rom
 >>put for writing get for reading
*/

#include<stdio.h> //Many file functions are present in this library only

int main()
{   char ch;
     //character arrays must be created if u eant to perform any operations on files
    
    char src_file[100],tar_file[100];//These are just the character arrays
    
    FILE *fp1,*fp2;   //File pointers we created to point to particular file in any mentioned mode
     printf("Eneter source file name\n");
     scanf("%s",src_file);
     printf("Eneter destination file name\n");
     scanf("%s",tar_file);
     
     //syntax:fopen(file_name,"mode")
    
    fp1=fopen(src_file,"r");  //opened in read mode
    if(fp1==NULL)
    {
        printf("Unable to open file in read mode\n");
        return 1;
    }   

    fp2=fopen(tar_file,"w");//opened in write mode

    if(fp2==NULL)
    {
        printf("Unable to open file in read mode\n");
        return 2;

    }

    while((ch=fgetc(fp1))!=EOF) //here fgetc(Pointer_to_file):copies the character to ch at which pointer is pointing
    {                           //u can also do it as ch=fgetc("Hello",pointer_name)
        fputc(ch,fp2);          //there are many other functions for reading and writing a file after 
                              //opening such as fgets(),fputc(),fputs()
    }
    
    printf("File copied successfully\n");
    fclose(fp1);   //Closoing of files is also ifportant as opening it becoz ,if we does not close it than no
    fclose(fp2);  //any other function would not be able to open it
    return 0;
}

     


   