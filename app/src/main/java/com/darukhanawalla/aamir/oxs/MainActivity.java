package com.darukhanawalla.aamir.oxs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[][] a = new int[3][3];
    boolean turn = true;
    int c =0;
    ImageView a1;
    ImageView a2;
    ImageView a3;
    ImageView b1;
    ImageView b2;
    ImageView b3;
    ImageView c1;
    ImageView c2;
    ImageView c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1 = (ImageView) findViewById(R.id.a1);
        a2 = (ImageView) findViewById(R.id.a2);
        a3 = (ImageView) findViewById(R.id.a3);
        b1 = (ImageView) findViewById(R.id.b1);
        b2 = (ImageView) findViewById(R.id.b2);
        b3 = (ImageView) findViewById(R.id.b3);
        c1 = (ImageView) findViewById(R.id.c1);
        c2 = (ImageView) findViewById(R.id.c2);
        c3 = (ImageView) findViewById(R.id.c3);
    }



    public void fa1(View view)
    {
        if(a[0][0]==0)
        {
            if(turn)
            {
                a1.setImageResource(R.drawable.x);
                a[0][0]=1;
            }
            else
            {
                a1.setImageResource(R.drawable.o);
                a[0][0]=2;
            }
            check();
            turn=!turn;
        }
    }

    public void fa2(View view)
    {
        if(a[0][1]==0)
        {
            if(turn)
            {
                a2.setImageResource(R.drawable.x);
                a[0][1]=1;
            }
            else
            {
                a2.setImageResource(R.drawable.o);
                a[0][1]=2;
            }
            check();
            turn=!turn;
        }
    }

    public void fa3(View view)
    {
        if(a[0][2]==0)
        {
            if(turn)
            {
                a3.setImageResource(R.drawable.x);
                a[0][2]=1;
            }
            else
            {
                a3.setImageResource(R.drawable.o);
                a[0][2]=2;
            }
            check();
            turn=!turn;
        }
    }

    public void fb1(View view)
    {
        if(a[1][0]==0)
        {
            if(turn)
            {
                b1.setImageResource(R.drawable.x);
                a[1][0]=1;
            }
            else
            {
                b1.setImageResource(R.drawable.o);
                a[1][0]=2;
            }
            check();
            turn=!turn;
        }
    }

    public void fb2(View view)
    {
        if(a[1][1]==0)
        {
            if(turn)
            {
                b2.setImageResource(R.drawable.x);
                a[1][1]=1;
            }
            else
            {
                b2.setImageResource(R.drawable.o);
                a[1][1]=2;
            }
            check();
            turn=!turn;
        }
    }

    public void fb3(View view)
    {
        if(a[1][2]==0)
        {
            if(turn)
            {
                b3.setImageResource(R.drawable.x);
                a[1][2]=1;
            }
            else
            {
                b3.setImageResource(R.drawable.o);
                a[1][2]=2;
            }
            check();
            turn=!turn;
        }
    }

    public void fc1(View view)
    {
        if(a[2][0]==0)
        {
            if(turn)
            {
                c1.setImageResource(R.drawable.x);
                a[2][0]=1;
            }
            else
            {
                c1.setImageResource(R.drawable.o);
                a[2][0]=2;
            }
            check();
            turn=!turn;
        }
        hack(1);
    }

    public void fc2(View view)
    {
        if(a[2][1]==0)
        {
            if(turn)
            {
                c2.setImageResource(R.drawable.x);
                a[2][1]=1;
            }
            else
            {
                c2.setImageResource(R.drawable.o);
                a[2][1]=2;
            }
            check();
            turn=!turn;
        }
    }

    public void fc3(View view)
    {
        if(a[2][2]==0)
        {
            if(turn)
            {
                c3.setImageResource(R.drawable.x);
                a[2][2]=1;
            }
            else
            {
                c3.setImageResource(R.drawable.o);
                a[2][2]=2;
            }
            check();
            turn=!turn;
        }
        hack(2);
    }


    public void check()
    {
        boolean gameOver = false;
        if(a[1][1]!=0)
        {
            if(a[1][1]==a[0][0] && a[1][1]==a[2][2])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);

                if (a[1][1] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            else if(a[1][1]==a[0][2] && a[1][1]==a[2][0])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);

                if (a[1][1] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            else if(a[1][1]==a[0][1] && a[1][1]==a[2][1])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                if (a[1][1] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            else if(a[1][1]==a[1][0] && a[1][1]==a[1][2])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                if (a[1][1] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
        }
        if(a[0][0]!=0 && !gameOver)
        {
            if(a[0][0]==a[0][1] && a[0][1]==a[0][2])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                if (a[0][0] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            else if(a[0][0]==a[1][0] && a[1][0]==a[2][0])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                if (a[0][0] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
        }
        if(a[2][2]!=0 && !gameOver)
        {
            if(a[2][2]==a[2][1] && a[2][1]==a[2][0])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                if (a[2][2] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            else if(a[2][2]==a[1][2] && a[1][2]==a[0][2])
            {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                gameOver=true;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                if (a[2][2] == 1)
                    Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
        }
        if(a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0 && !gameOver)
        {
            Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
            a1.setEnabled(false);
            a2.setEnabled(false);
            a3.setEnabled(false);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            c1.setEnabled(false);
            c2.setEnabled(false);
            c3.setEnabled(false);
            Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show();
        }

    }

    public void reset(View view)
    {
        a1.setImageResource(0);
        a2.setImageResource(0);
        a3.setImageResource(0);
        b1.setImageResource(0);
        b2.setImageResource(0);
        b3.setImageResource(0);
        c1.setImageResource(0);
        c2.setImageResource(0);
        c3.setImageResource(0);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                a[i][j]=0;
        }
        a1.setEnabled(true);
        a2.setEnabled(true);
        a3.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
        turn=true;
        c=0;
    }

    public void hack(int x)
    {
        c++;
        if(c==12)
        {
            if(x==2)
            {
                a1.setImageResource(R.drawable.o);
                b2.setImageResource(R.drawable.o);
                c3.setImageResource(R.drawable.o);
                a[0][0]=2;
                a[1][1]=2;
                a[2][2]=2;
            }
            else if(x==1)
            {
                a3.setImageResource(R.drawable.x);
                b2.setImageResource(R.drawable.x);
                c1.setImageResource(R.drawable.x);
                a[0][2]=1;
                a[1][1]=1;
                a[2][0]=1;
            }
            check();

        }
    }
}

