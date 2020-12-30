package com.example.kidslearningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Alphabet_page extends AppCompatActivity implements View.OnClickListener {

    ImageView img;
    MediaPlayer a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, rr, s, t, u, v, w, x, y, z;
    Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_page);
//Audio or Sound Declaration


        a = MediaPlayer.create(Alphabet_page.this, R.raw.a);
        b = MediaPlayer.create(Alphabet_page.this, R.raw.b);
        c = MediaPlayer.create(Alphabet_page.this, R.raw.c);
        d = MediaPlayer.create(Alphabet_page.this, R.raw.d);
        e = MediaPlayer.create(Alphabet_page.this, R.raw.e);
        f = MediaPlayer.create(Alphabet_page.this, R.raw.f);
        g = MediaPlayer.create(Alphabet_page.this, R.raw.g);
        h = MediaPlayer.create(Alphabet_page.this, R.raw.h);
        i = MediaPlayer.create(Alphabet_page.this, R.raw.i);
        j = MediaPlayer.create(Alphabet_page.this, R.raw.j);
        k = MediaPlayer.create(Alphabet_page.this, R.raw.k);
        l = MediaPlayer.create(Alphabet_page.this, R.raw.l);
        m = MediaPlayer.create(Alphabet_page.this, R.raw.m);
        n = MediaPlayer.create(Alphabet_page.this, R.raw.n);
        o = MediaPlayer.create(Alphabet_page.this, R.raw.o);
        p = MediaPlayer.create(Alphabet_page.this, R.raw.p);
        q = MediaPlayer.create(Alphabet_page.this, R.raw.q);
        rr = MediaPlayer.create(Alphabet_page.this, R.raw.r);
        s = MediaPlayer.create(Alphabet_page.this, R.raw.s);
        t = MediaPlayer.create(Alphabet_page.this, R.raw.t);
        u = MediaPlayer.create(Alphabet_page.this, R.raw.u);
        v = MediaPlayer.create(Alphabet_page.this, R.raw.v);
        w = MediaPlayer.create(Alphabet_page.this, R.raw.w);
        x = MediaPlayer.create(Alphabet_page.this, R.raw.x);
        y = MediaPlayer.create(Alphabet_page.this, R.raw.y);
        z = MediaPlayer.create(Alphabet_page.this, R.raw.z);


        //Declaration of Alphabets Button


        img = findViewById(R.id.imm_alfa);

          A = findViewById(R.id.A);
          B = findViewById(R.id.B);
          C = findViewById(R.id.C);
          D = findViewById(R.id.D);
          E = findViewById(R.id.E);
          F = findViewById(R.id.F);
          G = findViewById(R.id.G);
          H = findViewById(R.id.H);
          I = findViewById(R.id.I);
          J = findViewById(R.id.J);
          K = findViewById(R.id.K);
          L = findViewById(R.id.L);
          M = findViewById(R.id.M);
          N = findViewById(R.id.N);
          O = findViewById(R.id.O);
          P = findViewById(R.id.P);
          Q = findViewById(R.id.Q);
          r = findViewById(R.id.R);
          S = findViewById(R.id.S);
          T = findViewById(R.id.T);
          U = findViewById(R.id.U);
          V = findViewById(R.id.V);
          W = findViewById(R.id.W);
          X = findViewById(R.id.X);
          Y = findViewById(R.id.Y);
          Z = findViewById(R.id.Z);

        A.setOnClickListener(this);
        B.setOnClickListener(this);
        C.setOnClickListener(this);
        D.setOnClickListener(this);
        E.setOnClickListener(this);
        F.setOnClickListener(this);
        G.setOnClickListener(this);
        F.setOnClickListener(this);
        H.setOnClickListener(this);
        I.setOnClickListener(this);
        J.setOnClickListener(this);
        K.setOnClickListener(this);
        L.setOnClickListener(this);
        M.setOnClickListener(this);
        N.setOnClickListener(this);
        O.setOnClickListener(this);
        P.setOnClickListener(this);
        Q.setOnClickListener(this);
        r.setOnClickListener(this);
        S.setOnClickListener(this);
        T.setOnClickListener(this);
        U.setOnClickListener(this);
        V.setOnClickListener(this);
        W.setOnClickListener(this);
        X.setOnClickListener(this);
        Y.setOnClickListener(this);
        Z.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.A:
                a.start();
                img.setImageResource(R.mipmap.a_for_apple);
                break;
            case R.id.B:
                b.start();
                img.setImageResource(R.mipmap.b_for_baseball);
                break;
            case R.id.C:
                img.setImageResource(R.mipmap.c_for_clock);

                c.start();
                break;
            case R.id.D:
                img.setImageResource(R.mipmap.d_for_donkey);
                d.start();
                break;
            case R.id.E:
                img.setImageResource(R.mipmap.e_for_elephant);
                e.start();
                break;
            case R.id.F:
                img.setImageResource(R.mipmap.f_for_father);
                f.start();
                break;
            case R.id.G:
                img.setImageResource(R.mipmap.g_for_grandmother);
                g.start();
                break;
            case R.id.H:
                img.setImageResource(R.mipmap.h_for_hungry);
                h.start();
                break;
            case R.id.I:
                img.setImageResource(R.mipmap.i_for_internet);
                i.start();
                break;
            case R.id.J:
                img.setImageResource(R.mipmap.j_for_justice);
                j.start();
                break;
            case R.id.K:
                img.setImageResource(R.mipmap.k_for_kangaroo);
                k.start();
                break;
            case R.id.L:
                img.setImageResource(R.mipmap.l_for_london);
                l.start();
                break;
            case R.id.M:
                img.setImageResource(R.mipmap.m_for_monkey);
                m.start();
                break;
            case R.id.N:
                img.setImageResource(R.mipmap.n_for_norway);
                n.start();
                break;
            case R.id.O:
                img.setImageResource(R.mipmap.o_for_over);
                o.start();
                break;
            case R.id.P:
                img.setImageResource(R.mipmap.p_for_pillow);
                p.start();
                break;
            case R.id.Q:
                img.setImageResource(R.mipmap.q_for_question);
                q.start();
                break;
            case R.id.R:
                img.setImageResource(R.mipmap.r_for_rabbit);
                rr.start();
                break;
            case R.id.S:
                img.setImageResource(R.mipmap.s_for_superman);
                s.start();
                break;
            case R.id.T:
                img.setImageResource(R.mipmap.t_for_telephone);
                t.start();
                break;
            case R.id.U:
                img.setImageResource(R.mipmap.u_for_underwear);
                u.start();
                break;
            case R.id.V:
                img.setImageResource(R.mipmap.v_for_vaccine);
                v.start();
                break;
            case R.id.W:
                img.setImageResource(R.mipmap.w_for_www);
                w.start();
                break;
            case R.id.X:
                img.setImageResource(R.mipmap.x_for_xylophone);
                x.start();
                break;
            case R.id.Y:
                img.setImageResource(R.mipmap.y_for_yogurt);
                y.start();
                break;
            case R.id.Z:
                img.setImageResource(R.mipmap.z_for_zebra);
                z.start();
                break;
        }
    }
}
