package com.google.ads.e;

import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.google.ads.bt;

public class f extends t
{
  public f(bt parambt)
  {
    super(parambt);
  }

  public void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    paramCustomViewCallback.onCustomViewHidden();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.f
 * JD-Core Version:    0.6.2
 */