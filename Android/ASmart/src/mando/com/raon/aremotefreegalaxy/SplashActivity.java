package com.raon.aremotefreegalaxy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class SplashActivity extends Activity
{
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(paramInt3, 0.0F, paramInt4, 0.0F);
    localTranslateAnimation.setDuration(paramInt2);
    localTranslateAnimation.setFillAfter(true);
    localAnimationSet.addAnimation(localTranslateAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setFillAfter(true);
    localAlphaAnimation.setDuration(paramInt2);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.setFillAfter(true);
    localAnimationSet.setStartOffset(paramInt1);
    paramView.startAnimation(localAnimationSet);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903067);
    if (getResources().getBoolean(2131099654))
      setRequestedOrientation(1);
    Globals localGlobals = (Globals)getApplicationContext();
    if (localGlobals.f)
    {
      startActivity(new Intent(this, MainActivity.class));
      finish();
      return;
    }
    ImageView localImageView1 = (ImageView)findViewById(2131230898);
    ImageView localImageView2 = (ImageView)findViewById(2131230897);
    ImageView localImageView3 = (ImageView)findViewById(2131230896);
    ImageView localImageView4 = (ImageView)findViewById(2131230895);
    a(localImageView2, 0, 1000, -200, 0);
    a(localImageView1, 500, 1000, 200, 0);
    a(localImageView3, 700, 800, 0, 200);
    a(localImageView4, 500, 500, 0, 0);
    new Handler().postDelayed(new al(this), 1500L);
    localGlobals.f = true;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.SplashActivity
 * JD-Core Version:    0.6.2
 */