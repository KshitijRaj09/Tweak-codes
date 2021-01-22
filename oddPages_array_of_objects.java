/*"Create class Document with below attributes

id - int
title - String
folderName - String
pages - int

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - docsWithOddPages in Solution class.

This method will take array of Document objects and return another array with Document objects which has odd number of pages. 

This method should be called from main method and display values of returned objects as shared in the sample (in ascending order of id attribute). 

Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above sequence. 

Next call the method and display the result. 

Consider below sample input and output:

Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40


Output (each line has values separated by single space):
2 question1 exams 55
3 question2 exams 45



Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:
22
hello

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value hello. Instead it may be """".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.

"
*/

import java.util.*;
class Document {
    int id;
    String title;
    String folderName;
    int pages;
    public Document(int id, String title, String folderName, int pages){
        this.id=id;
        this.title=title;
        this.folderName = folderName;
        this.pages = pages;
    } 
    
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getFolder(){
        return folderName;
    }
    public int getPages(){
        return pages;
    }
}

public class Solution{
    public static Document[] docsWithOddPages(Document d[]){
        int size=0;
        for(int i=0; i<d.length; i++){
            if(d[i].getPages()%2!=0){
                size++;
            }
        }
        Document d1[]=new Document[size];
        for(int i=0,j=0; i<d.length; i++){
            if(d[i].getPages()%2!=0){
                d1[j++]=d[i];
            }
        }
        return d1;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int id=0, pages=0;
      String title="", folderName="";
      Document d[] = new Document[4];
      for(int i=0;i<4;i++){
          id = sc.nextInt();
          sc.nextLine();
          title = sc.nextLine();
          folderName = sc.nextLine();
          pages = sc.nextInt();
          sc.nextLine();
          d[i] = new Document(id,title,folderName,pages);
      }
      
     Document result[] = docsWithOddPages(d);
     
     for(int i=0; i<result.length;i++){
         System.out.println(result[i].getId()+" "+result[i].getTitle()+" "+result[i].getFolder()+" "+result[i].getPages());
     }  
    }
}
    
    
