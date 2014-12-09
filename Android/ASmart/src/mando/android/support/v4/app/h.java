package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class h extends Activity
{
  final Handler a = new i(this);
  final p b = new p();
  final m c = new j(this);
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  android.support.v4.d.l l;
  aa m;

  private static String a(View paramView)
  {
    char c1 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    switch (paramView.getVisibility())
    {
    default:
      localStringBuilder.append(c2);
    case 0:
    case 4:
    case 8:
    }
    while (true)
    {
      char c3;
      label108: char c4;
      label126: char c5;
      label143: char c6;
      label161: char c7;
      label179: char c8;
      label197: char c9;
      label215: label236: char c10;
      label253: int n;
      Resources localResources;
      if (paramView.isFocusable())
      {
        c3 = c1;
        localStringBuilder.append(c3);
        if (!paramView.isEnabled())
          break label533;
        c4 = 'E';
        localStringBuilder.append(c4);
        if (!paramView.willNotDraw())
          break label539;
        c5 = c2;
        localStringBuilder.append(c5);
        if (!paramView.isHorizontalScrollBarEnabled())
          break label546;
        c6 = 'H';
        localStringBuilder.append(c6);
        if (!paramView.isVerticalScrollBarEnabled())
          break label552;
        c7 = 'V';
        localStringBuilder.append(c7);
        if (!paramView.isClickable())
          break label558;
        c8 = 'C';
        localStringBuilder.append(c8);
        if (!paramView.isLongClickable())
          break label564;
        c9 = 'L';
        localStringBuilder.append(c9);
        localStringBuilder.append(' ');
        if (!paramView.isFocused())
          break label570;
        localStringBuilder.append(c1);
        if (!paramView.isSelected())
          break label575;
        c10 = 'S';
        localStringBuilder.append(c10);
        if (paramView.isPressed())
          c2 = 'P';
        localStringBuilder.append(c2);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        n = paramView.getId();
        if (n != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(n));
          localResources = paramView.getResources();
          if ((n != 0) && (localResources != null))
            switch (0xFF000000 & n)
            {
            default:
            case 2130706432:
            case 16777216:
            }
        }
      }
      try
      {
        String str1 = localResources.getResourcePackageName(n);
        while (true)
        {
          String str2 = localResources.getResourceTypeName(n);
          String str3 = localResources.getResourceEntryName(n);
          localStringBuilder.append(" ");
          localStringBuilder.append(str1);
          localStringBuilder.append(":");
          localStringBuilder.append(str2);
          localStringBuilder.append("/");
          localStringBuilder.append(str3);
          label485: localStringBuilder.append("}");
          return localStringBuilder.toString();
          localStringBuilder.append('V');
          break;
          localStringBuilder.append('I');
          break;
          localStringBuilder.append('G');
          break;
          c3 = c2;
          break label108;
          label533: c4 = c2;
          break label126;
          label539: c5 = 'D';
          break label143;
          label546: c6 = c2;
          break label161;
          label552: c7 = c2;
          break label179;
          label558: c8 = c2;
          break label197;
          label564: c9 = c2;
          break label215;
          label570: c1 = c2;
          break label236;
          label575: c10 = c2;
          break label253;
          str1 = "app";
          continue;
          str1 = "android";
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        break label485;
      }
    }
  }

  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null)
      paramPrintWriter.println("null");
    while (true)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int n = localViewGroup.getChildCount();
        if (n > 0)
        {
          String str = paramString + "  ";
          for (int i1 = 0; i1 < n; i1++)
            a(str, paramPrintWriter, localViewGroup.getChildAt(i1));
        }
      }
    }
  }

  aa a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.l == null)
      this.l = new android.support.v4.d.l();
    aa localaa = (aa)this.l.get(paramString);
    if (localaa == null)
    {
      if (paramBoolean2)
      {
        localaa = new aa(paramString, this, paramBoolean1);
        this.l.put(paramString, localaa);
      }
      return localaa;
    }
    localaa.a(this);
    return localaa;
  }

  protected void a()
  {
    this.b.m();
  }

  public void a(Fragment paramFragment)
  {
  }

  void a(String paramString)
  {
    if (this.l != null)
    {
      aa localaa = (aa)this.l.get(paramString);
      if ((localaa != null) && (!localaa.g))
      {
        localaa.h();
        this.l.remove(paramString);
      }
    }
  }

  void a(boolean paramBoolean)
  {
    if (!this.g)
    {
      this.g = true;
      this.h = paramBoolean;
      this.a.removeMessages(1);
      d();
    }
  }

  protected boolean a(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }

  public Object b()
  {
    return null;
  }

  public void c()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a.a(this);
      return;
    }
    this.i = true;
  }

  void d()
  {
    if (this.k)
    {
      this.k = false;
      if (this.m != null)
      {
        if (this.h)
          break label41;
        this.m.c();
      }
    }
    while (true)
    {
      this.b.p();
      return;
      label41: this.m.d();
    }
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT >= 11);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.d);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.g);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.k);
    if (this.m != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
      paramPrintWriter.println(":");
      this.m.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.b.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }

  public n e()
  {
    return this.b;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.b.i();
    int n = paramInt1 >> 16;
    if (n != 0)
    {
      int i1 = n - 1;
      if ((this.b.f == null) || (i1 < 0) || (i1 >= this.b.f.size()))
      {
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      Fragment localFragment = (Fragment)this.b.f.get(i1);
      if (localFragment == null)
      {
        Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      localFragment.a(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onBackPressed()
  {
    if (!this.b.c())
      finish();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.b.a(this, this.c, null);
    if (getLayoutInflater().getFactory() == null)
      getLayoutInflater().setFactory(this);
    super.onCreate(paramBundle);
    l locall = (l)getLastNonConfigurationInstance();
    if (locall != null)
      this.l = locall.e;
    Parcelable localParcelable;
    p localp;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localp = this.b;
      if (locall == null)
        break label100;
    }
    label100: for (ArrayList localArrayList = locall.d; ; localArrayList = null)
    {
      localp.a(localParcelable, localArrayList);
      this.b.j();
      return;
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.b.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11)
        return bool;
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString))
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.a);
    if (str1 == null)
      str1 = localTypedArray.getString(0);
    int n = localTypedArray.getResourceId(1, -1);
    String str2 = localTypedArray.getString(2);
    localTypedArray.recycle();
    if (!Fragment.b(this, str1))
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    int i1 = 0;
    if (0 != 0)
      i1 = null.getId();
    if ((i1 == -1) && (n == -1) && (str2 == null))
      throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
    Object localObject = null;
    if (n != -1)
      localObject = this.b.a(n);
    if ((localObject == null) && (str2 != null))
      localObject = this.b.a(str2);
    if ((localObject == null) && (i1 != -1))
      localObject = this.b.a(i1);
    if (p.a)
      Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(n) + " fname=" + str1 + " existing=" + localObject);
    int i2;
    if (localObject == null)
    {
      Fragment localFragment = Fragment.a(this, str1);
      localFragment.o = true;
      if (n != 0)
      {
        i2 = n;
        localFragment.w = i2;
        localFragment.x = i1;
        localFragment.y = str2;
        localFragment.p = true;
        localFragment.s = this.b;
        localFragment.a(this, paramAttributeSet, localFragment.d);
        this.b.a(localFragment, true);
        localObject = localFragment;
      }
    }
    while (true)
    {
      if (((Fragment)localObject).I != null)
        break label545;
      throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
      i2 = i1;
      break;
      if (((Fragment)localObject).p)
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(n) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i1) + " with another fragment for " + str1);
      ((Fragment)localObject).p = true;
      if (!((Fragment)localObject).C)
        ((Fragment)localObject).a(this, paramAttributeSet, ((Fragment)localObject).d);
      this.b.b((Fragment)localObject);
    }
    label545: if (n != 0)
      ((Fragment)localObject).I.setId(n);
    if (((Fragment)localObject).I.getTag() == null)
      ((Fragment)localObject).I.setTag(str2);
    return ((Fragment)localObject).I;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    a(false);
    this.b.r();
    if (this.m != null)
      this.m.h();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.b.s();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 0:
      return this.b.a(paramMenuItem);
    case 6:
    }
    return this.b.b(paramMenuItem);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.b.i();
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.b.b(paramMenu);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.e = false;
    if (this.a.hasMessages(2))
    {
      this.a.removeMessages(2);
      a();
    }
    this.b.n();
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.a.removeMessages(2);
    a();
    this.b.e();
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.i)
      {
        this.i = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return a(paramView, paramMenu) | this.b.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  protected void onResume()
  {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.e = true;
    this.b.e();
  }

  public final Object onRetainNonConfigurationInstance()
  {
    int n = 0;
    if (this.f)
      a(true);
    Object localObject = b();
    ArrayList localArrayList = this.b.g();
    int i1;
    if (this.l != null)
    {
      int i2 = this.l.size();
      aa[] arrayOfaa = new aa[i2];
      for (int i3 = i2 - 1; i3 >= 0; i3--)
        arrayOfaa[i3] = ((aa)this.l.c(i3));
      i1 = 0;
      if (n < i2)
      {
        aa localaa = arrayOfaa[n];
        if (localaa.g)
          i1 = 1;
        while (true)
        {
          n++;
          break;
          localaa.h();
          this.l.remove(localaa.d);
        }
      }
    }
    else
    {
      i1 = 0;
    }
    if ((localArrayList == null) && (i1 == 0) && (localObject == null))
      return null;
    l locall = new l();
    locall.a = null;
    locall.b = localObject;
    locall.c = null;
    locall.d = localArrayList;
    locall.e = this.l;
    return locall;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.b.h();
    if (localParcelable != null)
      paramBundle.putParcelable("android:support:fragments", localParcelable);
  }

  protected void onStart()
  {
    super.onStart();
    this.f = false;
    this.g = false;
    this.a.removeMessages(1);
    if (!this.d)
    {
      this.d = true;
      this.b.k();
    }
    this.b.i();
    this.b.e();
    if (!this.k)
    {
      this.k = true;
      if (this.m == null)
        break label146;
      this.m.b();
    }
    int n;
    aa[] arrayOfaa;
    while (true)
    {
      this.j = true;
      this.b.l();
      if (this.l == null)
        return;
      n = this.l.size();
      arrayOfaa = new aa[n];
      for (int i1 = n - 1; i1 >= 0; i1--)
        arrayOfaa[i1] = ((aa)this.l.c(i1));
      label146: if (!this.j)
      {
        this.m = a("(root)", this.k, false);
        if ((this.m != null) && (!this.m.f))
          this.m.b();
      }
    }
    for (int i2 = 0; i2 < n; i2++)
    {
      aa localaa = arrayOfaa[i2];
      localaa.e();
      localaa.g();
    }
  }

  protected void onStop()
  {
    super.onStop();
    this.f = true;
    this.a.sendEmptyMessage(1);
    this.b.o();
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0))
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.h
 * JD-Core Version:    0.6.2
 */