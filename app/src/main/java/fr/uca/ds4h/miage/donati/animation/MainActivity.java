package fr.uca.ds4h.miage.donati.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animation par succession d'images
        //utilise drawable/monanimation.xml
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setBackgroundResource(R.drawable.monanimation);
        AnimationDrawable anim = (AnimationDrawable) img.getBackground();
        anim.start();
    }

    //Méthode associée à l'événement click du bouton
    //association "en dur" dans activity_main.xml
    public void sortie(View v) {
        //Animation d'une propriété
        //Le textview se déplace vers le haut
        TextView t = (TextView)findViewById(R.id.textView);
        t.setHeight(t.getHeight()+50);

        //Chargement d'une animation et application au bouton
        //utilise anim/sortie.xml
        Animation monAnim;
        monAnim = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sortie);
        monAnim.setDuration(2000);
        v.startAnimation(monAnim);

        //application de l'animation au textview
        t.startAnimation(monAnim);
    }
}