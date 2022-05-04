package com.gamegards.allinonev3._LudoGame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.TextView;

import com.gamegards.allinonev3._AdharBahar.Fragments.GameFragment;
import com.gamegards.allinonev3._AdharBahar.Fragments.HistoryFragment;
import com.gamegards.allinonev3.R;
import com.gamegards.allinonev3.SampleClasses.Const;
import com.squareup.picasso.Picasso;

import static com.gamegards.allinonev3._TeenPatti.PublicTable.MY_PREFS_NAME;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gamegards.allinonev3.Interface.ApiRequest;
import com.gamegards.allinonev3.Interface.Callback;
import com.gamegards.allinonev3.SampleClasses.Const;
import com.gamegards.allinonev3.Utils.Animations;
import com.gamegards.allinonev3.model.CardModel;
import com.gamegards.allinonev3.Utils.Funtions;
import com.gamegards.allinonev3.model.Usermodel;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

import static com.gamegards.allinonev3._TeenPatti.PublicTable.MY_PREFS_NAME;
import static com.gamegards.allinonev3.Utils.Funtions.ANIMATION_SPEED;
import static com.gamegards.allinonev3.Utils.Funtions.convertDpToPixel;

public class LudoGame extends AppCompatActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_ludo_game);

    WebView ludoView = (WebView) findViewById(R.id.ludoView);
    WebSettings webSetting = ludoView.getSettings();

    webSetting.setJavaScriptEnabled(true);

    ludoView.loadUrl("https://dhirajlochib.github.io/ludo/");

   //    setContentView(ludoView);
  }
}