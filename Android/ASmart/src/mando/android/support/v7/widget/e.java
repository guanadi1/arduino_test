package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.p;
import android.support.v7.b.b;
import android.support.v7.b.g;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class e extends p
  implements View.OnClickListener
{
  private SearchManager j = (SearchManager)this.d.getSystemService("search");
  private SearchView k;
  private SearchableInfo l;
  private Context m;
  private WeakHashMap n;
  private boolean o = false;
  private int p = 1;
  private ColorStateList q;
  private int r = -1;
  private int s = -1;
  private int t = -1;
  private int u = -1;
  private int v = -1;
  private int w = -1;

  public e(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap paramWeakHashMap)
  {
    super(paramContext, g.abc_search_dropdown_item_icons_2line, null, true);
    this.k = paramSearchView;
    this.l = paramSearchableInfo;
    this.m = paramContext;
    this.n = paramWeakHashMap;
  }

  private Drawable a(ComponentName paramComponentName)
  {
    String str = paramComponentName.flattenToShortString();
    if (this.n.containsKey(str))
    {
      Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.n.get(str);
      if (localConstantState == null)
        return null;
      return localConstantState.newDrawable(this.m.getResources());
    }
    Drawable localDrawable = b(paramComponentName);
    Object localObject = null;
    if (localDrawable == null);
    while (true)
    {
      this.n.put(str, localObject);
      return localDrawable;
      localObject = localDrawable.getConstantState();
    }
  }

  private Drawable a(String paramString)
  {
    Drawable localDrawable1;
    if ((paramString == null) || (paramString.length() == 0) || ("0".equals(paramString)))
      localDrawable1 = null;
    while (true)
    {
      return localDrawable1;
      try
      {
        int i = Integer.parseInt(paramString);
        String str = "android.resource://" + this.m.getPackageName() + "/" + i;
        localDrawable1 = b(str);
        if (localDrawable1 == null)
        {
          Drawable localDrawable3 = this.m.getResources().getDrawable(i);
          a(str, localDrawable3);
          return localDrawable3;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localDrawable1 = b(paramString);
        if (localDrawable1 == null)
        {
          Drawable localDrawable2 = b(Uri.parse(paramString));
          a(paramString, localDrawable2);
          return localDrawable2;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Log.w("SuggestionsAdapter", "Icon resource not found: " + paramString);
      }
    }
    return null;
  }

  private static String a(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1)
      return null;
    try
    {
      String str = paramCursor.getString(paramInt);
      return str;
    }
    catch (Exception localException)
    {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", localException);
    }
    return null;
  }

  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }

  private void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
      return;
    }
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }

  private void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramTextView.setVisibility(8);
      return;
    }
    paramTextView.setVisibility(0);
  }

  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
      this.n.put(paramString, paramDrawable.getConstantState());
  }

  private Drawable b(ComponentName paramComponentName)
  {
    PackageManager localPackageManager = this.d.getPackageManager();
    ActivityInfo localActivityInfo;
    int i;
    try
    {
      localActivityInfo = localPackageManager.getActivityInfo(paramComponentName, 128);
      i = localActivityInfo.getIconResource();
      if (i == 0)
        return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.w("SuggestionsAdapter", localNameNotFoundException.toString());
      return null;
    }
    Drawable localDrawable = localPackageManager.getDrawable(paramComponentName.getPackageName(), i, localActivityInfo.applicationInfo);
    if (localDrawable == null)
    {
      Log.w("SuggestionsAdapter", "Invalid icon resource " + i + " for " + paramComponentName.flattenToShortString());
      return null;
    }
    return localDrawable;
  }

  private Drawable b(Uri paramUri)
  {
    try
    {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool)
        try
        {
          Drawable localDrawable2 = a(paramUri);
          return localDrawable2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          throw new FileNotFoundException("Resource does not exist: " + paramUri);
        }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Log.w("SuggestionsAdapter", "Icon not found: " + paramUri + ", " + localFileNotFoundException.getMessage());
      return null;
    }
    InputStream localInputStream = this.m.getContentResolver().openInputStream(paramUri);
    if (localInputStream == null)
      throw new FileNotFoundException("Failed to open " + paramUri);
    try
    {
      Drawable localDrawable1 = Drawable.createFromStream(localInputStream, null);
      try
      {
        localInputStream.close();
        return localDrawable1;
      }
      catch (IOException localIOException2)
      {
        Log.e("SuggestionsAdapter", "Error closing icon stream for " + paramUri, localIOException2);
        return localDrawable1;
      }
    }
    finally
    {
    }
    try
    {
      localInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        Log.e("SuggestionsAdapter", "Error closing icon stream for " + paramUri, localIOException1);
    }
  }

  private Drawable b(String paramString)
  {
    Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.n.get(paramString);
    if (localConstantState == null)
      return null;
    return localConstantState.newDrawable();
  }

  private CharSequence b(CharSequence paramCharSequence)
  {
    if (this.q == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.d.getTheme().resolveAttribute(b.textColorSearchUrl, localTypedValue, true);
      this.q = this.d.getResources().getColorStateList(localTypedValue.resourceId);
    }
    SpannableString localSpannableString = new SpannableString(paramCharSequence);
    localSpannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.q, null), 0, paramCharSequence.length(), 33);
    return localSpannableString;
  }

  private void d(Cursor paramCursor)
  {
    if (paramCursor != null);
    for (Bundle localBundle = paramCursor.getExtras(); ; localBundle = null)
    {
      if ((localBundle != null) && (localBundle.getBoolean("in_progress")));
      return;
    }
  }

  private Drawable e(Cursor paramCursor)
  {
    Drawable localDrawable;
    if (this.u == -1)
      localDrawable = null;
    do
    {
      return localDrawable;
      localDrawable = a(paramCursor.getString(this.u));
    }
    while (localDrawable != null);
    return g(paramCursor);
  }

  private Drawable f(Cursor paramCursor)
  {
    if (this.v == -1)
      return null;
    return a(paramCursor.getString(this.v));
  }

  private Drawable g(Cursor paramCursor)
  {
    Drawable localDrawable = a(this.l.getSearchActivity());
    if (localDrawable != null)
      return localDrawable;
    return this.d.getPackageManager().getDefaultActivityIcon();
  }

  Cursor a(SearchableInfo paramSearchableInfo, String paramString, int paramInt)
  {
    if (paramSearchableInfo == null);
    String str1;
    do
    {
      return null;
      str1 = paramSearchableInfo.getSuggestAuthority();
    }
    while (str1 == null);
    Uri.Builder localBuilder = new Uri.Builder().scheme("content").authority(str1).query("").fragment("");
    String str2 = paramSearchableInfo.getSuggestPath();
    if (str2 != null)
      localBuilder.appendEncodedPath(str2);
    localBuilder.appendPath("search_suggest_query");
    String str3 = paramSearchableInfo.getSuggestSelection();
    if (str3 != null);
    for (String[] arrayOfString = { paramString }; ; arrayOfString = null)
    {
      if (paramInt > 0)
        localBuilder.appendQueryParameter("limit", String.valueOf(paramInt));
      Uri localUri = localBuilder.build();
      return this.d.getContentResolver().query(localUri, null, str3, arrayOfString, null);
      localBuilder.appendPath(paramString);
    }
  }

  public Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    for (String str = ""; (this.k.getVisibility() != 0) || (this.k.getWindowVisibility() != 0); str = paramCharSequence.toString())
      return null;
    try
    {
      Cursor localCursor = a(this.l, str, 50);
      if (localCursor != null)
      {
        localCursor.getCount();
        return localCursor;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", localRuntimeException);
    }
    return null;
  }

  Drawable a(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str))
      throw new FileNotFoundException("No authority: " + paramUri);
    Resources localResources;
    List localList;
    try
    {
      localResources = this.d.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null)
        throw new FileNotFoundException("No path: " + paramUri);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    }
    int i = localList.size();
    if (i == 1);
    int i1;
    while (true)
    {
      try
      {
        int i2 = Integer.parseInt((String)localList.get(0));
        i1 = i2;
        if (i1 != 0)
          break;
        throw new FileNotFoundException("No resource found for: " + paramUri);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      }
      if (i == 2)
        i1 = localResources.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
      else
        throw new FileNotFoundException("More than two path segments: " + paramUri);
    }
    return localResources.getDrawable(i1);
  }

  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.a(paramContext, paramCursor, paramViewGroup);
    localView.setTag(new f(localView));
    return localView;
  }

  public void a(int paramInt)
  {
    this.p = paramInt;
  }

  public void a(Cursor paramCursor)
  {
    if (this.o)
    {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null)
        paramCursor.close();
    }
    while (true)
    {
      return;
      try
      {
        super.a(paramCursor);
        if (paramCursor != null)
        {
          this.r = paramCursor.getColumnIndex("suggest_text_1");
          this.s = paramCursor.getColumnIndex("suggest_text_2");
          this.t = paramCursor.getColumnIndex("suggest_text_2_url");
          this.u = paramCursor.getColumnIndex("suggest_icon_1");
          this.v = paramCursor.getColumnIndex("suggest_icon_2");
          this.w = paramCursor.getColumnIndex("suggest_flags");
          return;
        }
      }
      catch (Exception localException)
      {
        Log.e("SuggestionsAdapter", "error changing cursor and caching columns", localException);
      }
    }
  }

  public void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    f localf = (f)paramView.getTag();
    if (this.w != -1);
    for (int i = paramCursor.getInt(this.w); ; i = 0)
    {
      if (localf.a != null)
      {
        String str2 = a(paramCursor, this.r);
        a(localf.a, str2);
      }
      Object localObject;
      if (localf.b != null)
      {
        String str1 = a(paramCursor, this.t);
        if (str1 == null)
          break label239;
        localObject = b(str1);
        if (!TextUtils.isEmpty((CharSequence)localObject))
          break label252;
        if (localf.a != null)
        {
          localf.a.setSingleLine(false);
          localf.a.setMaxLines(2);
        }
      }
      while (true)
      {
        a(localf.b, (CharSequence)localObject);
        if (localf.c != null)
          a(localf.c, e(paramCursor), 4);
        if (localf.d != null)
          a(localf.d, f(paramCursor), 8);
        if ((this.p != 2) && ((this.p != 1) || ((i & 0x1) == 0)))
          break label281;
        localf.e.setVisibility(0);
        localf.e.setTag(localf.a.getText());
        localf.e.setOnClickListener(this);
        return;
        label239: localObject = a(paramCursor, this.s);
        break;
        label252: if (localf.a != null)
        {
          localf.a.setSingleLine(true);
          localf.a.setMaxLines(1);
        }
      }
      label281: localf.e.setVisibility(8);
      return;
    }
  }

  public CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null);
    String str2;
    do
    {
      do
      {
        return null;
        String str1 = a(paramCursor, "suggest_intent_query");
        if (str1 != null)
          return str1;
        if (this.l.shouldRewriteQueryFromData())
        {
          String str3 = a(paramCursor, "suggest_intent_data");
          if (str3 != null)
            return str3;
        }
      }
      while (!this.l.shouldRewriteQueryFromText());
      str2 = a(paramCursor, "suggest_text_1");
    }
    while (str2 == null);
    return str2;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      View localView2 = super.getView(paramInt, paramView, paramViewGroup);
      return localView2;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", localRuntimeException);
      View localView1 = a(this.d, this.c, paramViewGroup);
      if (localView1 != null)
        ((f)localView1.getTag()).a.setText(localRuntimeException.toString());
      return localView1;
    }
  }

  public boolean hasStableIds()
  {
    return false;
  }

  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    d(a());
  }

  public void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    d(a());
  }

  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof CharSequence))
      this.k.a((CharSequence)localObject);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.e
 * JD-Core Version:    0.6.2
 */