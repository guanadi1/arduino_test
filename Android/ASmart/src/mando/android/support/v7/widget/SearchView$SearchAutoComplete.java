package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;

public class SearchView$SearchAutoComplete extends AutoCompleteTextView
{
  private int a = getThreshold();
  private SearchView b;

  public SearchView$SearchAutoComplete(Context paramContext)
  {
    super(paramContext);
  }

  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean enoughToFilter()
  {
    return (this.a <= 0) || (super.enoughToFilter());
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    this.b.d();
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        KeyEvent.DispatcherState localDispatcherState2 = getKeyDispatcherState();
        if (localDispatcherState2 != null)
          localDispatcherState2.startTracking(paramKeyEvent, this);
        return true;
      }
      if (paramKeyEvent.getAction() == 1)
      {
        KeyEvent.DispatcherState localDispatcherState1 = getKeyDispatcherState();
        if (localDispatcherState1 != null)
          localDispatcherState1.handleUpEvent(paramKeyEvent);
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          this.b.clearFocus();
          SearchView.a(this.b, false);
          return true;
        }
      }
    }
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (this.b.hasFocus()) && (getVisibility() == 0))
    {
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
      if (SearchView.a(getContext()))
        SearchView.a.a(this, true);
    }
  }

  public void performCompletion()
  {
  }

  protected void replaceText(CharSequence paramCharSequence)
  {
  }

  void setSearchView(SearchView paramSearchView)
  {
    this.b = paramSearchView;
  }

  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    this.a = paramInt;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.SearchAutoComplete
 * JD-Core Version:    0.6.2
 */