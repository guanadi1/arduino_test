package com.google.ads.e;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.AdActivity;
import com.google.ads.b.e;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;

public class t extends WebChromeClient
{
  private final bt a;

  public t(bt parambt)
  {
    this.a = parambt;
  }

  private static void a(AlertDialog.Builder paramBuilder, Context paramContext, String paramString1, String paramString2, JsPromptResult paramJsPromptResult)
  {
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString1);
    EditText localEditText = new EditText(paramContext);
    localEditText.setText(paramString2);
    localLinearLayout.addView(localTextView);
    localLinearLayout.addView(localEditText);
    paramBuilder.setView(localLinearLayout).setPositiveButton(17039370, new z(paramJsPromptResult, localEditText)).setNegativeButton(17039360, new y(paramJsPromptResult)).setOnCancelListener(new x(paramJsPromptResult)).create().show();
  }

  private static void a(AlertDialog.Builder paramBuilder, String paramString, JsResult paramJsResult)
  {
    paramBuilder.setMessage(paramString).setPositiveButton(17039370, new w(paramJsResult)).setNegativeButton(17039360, new v(paramJsResult)).setOnCancelListener(new u(paramJsResult)).create().show();
  }

  private static boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    if ((paramWebView instanceof e))
    {
      AdActivity localAdActivity = ((e)paramWebView).i();
      if (localAdActivity != null)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(localAdActivity);
        localBuilder.setTitle(paramString1);
        if (paramBoolean)
          a(localBuilder, localAdActivity, paramString2, paramString3, paramJsPromptResult);
        while (true)
        {
          return true;
          a(localBuilder, paramString2, paramJsResult);
        }
      }
    }
    return false;
  }

  public void onCloseWindow(WebView paramWebView)
  {
    if ((paramWebView instanceof e))
      ((e)paramWebView).f();
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str = "JS: " + paramConsoleMessage.message() + " (" + paramConsoleMessage.sourceId() + ":" + paramConsoleMessage.lineNumber() + ")";
    switch (s.a[paramConsoleMessage.messageLevel().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return super.onConsoleMessage(paramConsoleMessage);
      i.b(str);
      continue;
      i.e(str);
      continue;
      i.c(str);
      continue;
      i.a(str);
    }
  }

  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    bs localbs = (bs)((br)this.a.d.a()).b.a();
    long l = ((Long)localbs.l.a()).longValue() - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L)
      if ((paramLong2 > l) || (paramLong2 > ((Long)localbs.m.a()).longValue()));
    while (true)
    {
      paramQuotaUpdater.updateQuota(paramLong2);
      return;
      paramLong2 = 0L;
      continue;
      if (paramLong2 == 0L)
      {
        paramLong2 = Math.min(paramLong1 + Math.min(((Long)localbs.n.a()).longValue(), l), ((Long)localbs.m.a()).longValue());
      }
      else
      {
        if (paramLong2 <= Math.min(((Long)localbs.m.a()).longValue() - paramLong1, l))
          paramLong1 += paramLong2;
        paramLong2 = paramLong1;
      }
    }
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView, paramString1, paramString2, null, paramJsResult, null, false);
  }

  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView, paramString1, paramString2, null, paramJsResult, null, false);
  }

  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView, paramString1, paramString2, null, paramJsResult, null, false);
  }

  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(paramWebView, paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }

  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    bs localbs = (bs)((br)this.a.d.a()).b.a();
    long l1 = ((Long)localbs.k.a()).longValue() - paramLong2;
    long l2 = paramLong1 + ((Long)localbs.j.a()).longValue();
    if (l1 < l2)
    {
      paramQuotaUpdater.updateQuota(0L);
      return;
    }
    paramQuotaUpdater.updateQuota(l2);
  }

  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    paramCustomViewCallback.onCustomViewHidden();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.t
 * JD-Core Version:    0.6.2
 */