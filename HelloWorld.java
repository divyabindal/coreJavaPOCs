public class HelloWorld{
    String input,output;
    String[] keywords = {"as","if","this","and","then"};
    String[] colour = {"[blue]","[red]","[red]","[blue]","[orange]"};
    String[] cases = {"capital","lower","lower","capital","lower"};
    String[] fontType = {"[normal]","[bold]","[bold]","[normal]","[normal]"};
    
    public HelloWorld(String in){
        input = in;
    }
    
    public void getOutput(){
        for(int i=0;i<keywords.length;i++){
            if(cases[i].equals("capital")&&fontType[i].equals("[bold]")){
                input = input.replaceAll(keywords[i],colour[i]+fontType[i]+keywords[i].toUpperCase()+fontType[i]+colour[i]);
            }
            else if(cases[i].equals("lower")&&fontType[i].equals("[bold]")){
                input = input.replaceAll(keywords[i],colour[i]+fontType[i]+keywords[i].toLowerCase()+fontType[i]+colour[i]);
            }
            else if(cases[i].equals("capital")&&fontType[i].equals("[normal]")){
                input = input.replaceAll(keywords[i],colour[i]+keywords[i].toUpperCase()+colour[i]);
            }
            else{
                input = input.replaceAll(keywords[i],colour[i]+keywords[i]+colour[i]);
            }
        }
        output = input;
        System.out.println("Output : "+output);
    }

    public static void main(String []args){
        HelloWorld hw = new HelloWorld("if hope is that then will fill and terraces to make as a statement about the importance of this club");
        hw.getOutput();
     }
}