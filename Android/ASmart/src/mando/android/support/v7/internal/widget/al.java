package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListAdapter;

class al
  implements DialogInterface.OnClickListener, ap
{
  private AlertDialog b;
  private ListAdapter c;
  private CharSequence d;

  private al(aj paramaj)
  {
  }

  public void a(ListAdapter paramListAdapter)
  {
    this.c = paramListAdapter;
  }

  public void a(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
  }

  public void c()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a.getContext());
    if (this.d != null)
      localBuilder.setTitle(this.d);
    this.b = localBuilder.setSingleChoiceItems(this.c, this.a.f(), this).show();
  }

  public void d()
  {
    this.b.dismiss();
    this.b = null;
  }

  public boolean f()
  {
    if (this.b != null)
      return this.b.isShowing();
    return false;
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a(paramInt);
    if (this.a.t != null)
      this.a.a(null, paramInt, this.c.getItemId(paramInt));
    d();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.al
 * JD-Core Version:    0.6.2
 */