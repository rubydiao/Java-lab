package capitalize;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class capitalize
{
    private ArrayList<String> Data = new ArrayList<String>();
    capitalize()
    {
        
    }
    public void Add(String value)
    {
        Data.add(value);
    }
    
    public void capitalizePlurals()
    {
        for(int i = 0 ; i < Data.size() ; i++)
        {
            String word = Data.get(i);
            if(word.endsWith("s"))
            {
                String kak = word.toUpperCase();
            }
        }
    }
    public void removePlural()
    {
        for(int i = 0 ; i < Data.size() ; i++)
        {
            String word = Data.get(i);
            if(word.endsWith("s"))
            {
                Data.remove(i);
                i--;
            }
        }
    }
    public void Reverse()
    {
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = Data.size() - 1 ; i >= 0 ; i--)
        {
            temp.add(Data.get(i));
        }
        this.Data = temp;
    }
    
    public void Print()
    {
        for(int i = 0 ; i < Data.size() ; i++)
        {
            System.out.println(Data.get(i));
        }
       
    }
        
};

public class capitalizeTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        capitalize l = new capitalize();
        int select;
        int x;
        x = input.nextInt();
        for(int i = 0 ; i < x ; i++)
        {
            select = input.nextInt();
            if (select == 1)
            {
                String insert = input.next();
                l.Add(insert);
            }
            else if(select == 2 )
            {
                l.Reverse();
            }
            else if (select == 3)
            {
                l.capitalizePlurals();
            }
            else if(select == 4)
            {
                l.removePlural();
            }
            else if (i == x)
            {
                l.Print();
            }
        }
       l.Print();
    }
    
}
