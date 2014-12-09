package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

class s
  implements TransformationMethod
{
  private final Locale a;

  public s(Context paramContext)
  {
    this.a = paramContext.getResources().getConfiguration().locale;
  }

  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramCharSequence != null)
      return paramCharSequence.toString().toUpperCase(this.a);
    return null;
  }

  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.s
 * JD-Core Version:    0.6.2
 */