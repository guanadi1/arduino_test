package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public class ProgressBarICS extends View
{
  private static final int[] f = { 16843062, 16843063, 16843064, 16843065, 16843066, 16843067, 16843068, 16843069, 16843070, 16843071, 16843039, 16843072, 16843040, 16843073 };
  int a;
  int b;
  int c;
  int d;
  Bitmap e;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private Transformation n;
  private AlphaAnimation o;
  private Drawable p;
  private Drawable q;
  private Drawable r;
  private boolean s;
  private Interpolator t;
  private ae u;
  private long v = Thread.currentThread().getId();
  private boolean w;
  private long x;
  private boolean y;

  public ProgressBarICS(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    c();
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, f, paramInt1, paramInt2);
    this.s = true;
    setMax(localTypedArray.getInt(0, this.i));
    setProgress(localTypedArray.getInt(1, this.g));
    setSecondaryProgress(localTypedArray.getInt(2, this.h));
    boolean bool1 = localTypedArray.getBoolean(3, this.l);
    this.m = localTypedArray.getBoolean(4, this.m);
    Drawable localDrawable1 = localTypedArray.getDrawable(5);
    if (localDrawable1 != null)
      setIndeterminateDrawable(a(localDrawable1));
    Drawable localDrawable2 = localTypedArray.getDrawable(6);
    if (localDrawable2 != null)
      setProgressDrawable(a(localDrawable2, false));
    this.k = localTypedArray.getInt(7, this.k);
    this.j = localTypedArray.getInt(8, this.j);
    this.a = localTypedArray.getDimensionPixelSize(9, this.a);
    this.b = localTypedArray.getDimensionPixelSize(10, this.b);
    this.c = localTypedArray.getDimensionPixelSize(11, this.c);
    this.d = localTypedArray.getDimensionPixelSize(12, this.d);
    int i1 = localTypedArray.getResourceId(13, 17432587);
    if (i1 > 0)
      a(paramContext, i1);
    localTypedArray.recycle();
    this.s = false;
    boolean bool2;
    if (!this.m)
    {
      bool2 = false;
      if (!bool1);
    }
    else
    {
      bool2 = true;
    }
    setIndeterminate(bool2);
  }

  private Drawable a(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof AnimationDrawable))
    {
      AnimationDrawable localAnimationDrawable1 = (AnimationDrawable)paramDrawable;
      int i1 = localAnimationDrawable1.getNumberOfFrames();
      AnimationDrawable localAnimationDrawable2 = new AnimationDrawable();
      localAnimationDrawable2.setOneShot(localAnimationDrawable1.isOneShot());
      for (int i2 = 0; i2 < i1; i2++)
      {
        Drawable localDrawable = a(localAnimationDrawable1.getFrame(i2), true);
        localDrawable.setLevel(10000);
        localAnimationDrawable2.addFrame(localDrawable, localAnimationDrawable1.getDuration(i2));
      }
      localAnimationDrawable2.setLevel(10000);
      paramDrawable = localAnimationDrawable2;
    }
    return paramDrawable;
  }

  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    int i1 = 0;
    Object localObject;
    if ((paramDrawable instanceof LayerDrawable))
    {
      LayerDrawable localLayerDrawable = (LayerDrawable)paramDrawable;
      int i2 = localLayerDrawable.getNumberOfLayers();
      Drawable[] arrayOfDrawable = new Drawable[i2];
      int i3 = 0;
      if (i3 < i2)
      {
        int i4 = localLayerDrawable.getId(i3);
        Drawable localDrawable = localLayerDrawable.getDrawable(i3);
        if ((i4 == 16908301) || (i4 == 16908303));
        for (boolean bool = true; ; bool = false)
        {
          arrayOfDrawable[i3] = a(localDrawable, bool);
          i3++;
          break;
        }
      }
      localObject = new LayerDrawable(arrayOfDrawable);
      while (i1 < i2)
      {
        ((LayerDrawable)localObject).setId(i1, localLayerDrawable.getId(i1));
        i1++;
      }
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      Bitmap localBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
      if (this.e == null)
        this.e = localBitmap;
      ShapeDrawable localShapeDrawable = new ShapeDrawable(getDrawableShape());
      BitmapShader localBitmapShader = new BitmapShader(localBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      localShapeDrawable.getPaint().setShader(localBitmapShader);
      if (paramBoolean)
      {
        localObject = new ClipDrawable(localShapeDrawable, 3, 1);
        return localObject;
      }
      return localShapeDrawable;
    }
    return paramDrawable;
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 - getPaddingRight() - getPaddingLeft();
    int i2 = paramInt2 - getPaddingBottom() - getPaddingTop();
    float f1;
    int i5;
    int i3;
    int i4;
    int i6;
    if (this.p != null)
      if ((this.m) && (!(this.p instanceof AnimationDrawable)))
      {
        int i7 = this.p.getIntrinsicWidth();
        int i8 = this.p.getIntrinsicHeight();
        f1 = i7 / i8;
        float f2 = paramInt1 / paramInt2;
        if (f1 != f2)
          if (f2 > f1)
          {
            int i12 = (int)(f1 * paramInt2);
            i5 = (paramInt1 - i12) / 2;
            i3 = i12 + i5;
            i4 = i2;
            i6 = 0;
            this.p.setBounds(i5, i6, i3, i4);
          }
      }
    while (true)
    {
      if (this.q != null)
        this.q.setBounds(0, 0, i3, i4);
      return;
      int i9 = (int)(paramInt1 * (1.0F / f1));
      int i10 = (paramInt2 - i9) / 2;
      int i11 = i9 + i10;
      i3 = i1;
      i4 = i11;
      i6 = i10;
      i5 = 0;
      break;
      i3 = i1;
      i4 = i2;
      i5 = 0;
      i6 = 0;
      break;
      i3 = i1;
      i4 = i2;
    }
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        if (this.v == Thread.currentThread().getId())
        {
          a(paramInt1, paramInt2, paramBoolean, true);
          return;
        }
        if (this.u != null)
        {
          localae = this.u;
          this.u = null;
          localae.a(paramInt1, paramInt2, paramBoolean);
          post(localae);
          continue;
        }
      }
      finally
      {
      }
      ae localae = new ae(this, paramInt1, paramInt2, paramBoolean);
    }
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    while (true)
    {
      float f1;
      Object localObject2;
      Drawable localDrawable;
      try
      {
        if (this.i > 0)
        {
          f1 = paramInt2 / this.i;
          localObject2 = this.r;
          if (localObject2 != null)
          {
            boolean bool = localObject2 instanceof LayerDrawable;
            localDrawable = null;
            if (!bool)
              break label90;
            localDrawable = ((LayerDrawable)localObject2).findDrawableByLayerId(paramInt1);
            break label90;
            ((Drawable)localObject2).setLevel(i1);
          }
        }
        else
        {
          f1 = 0.0F;
          continue;
        }
        invalidate();
        continue;
      }
      finally
      {
      }
      label90: int i1 = (int)(f1 * 10000.0F);
      if (localDrawable != null)
        localObject2 = localDrawable;
    }
  }

  private void c()
  {
    this.i = 100;
    this.g = 0;
    this.h = 0;
    this.l = false;
    this.m = false;
    this.k = 4000;
    this.j = 1;
    this.a = 24;
    this.b = 48;
    this.c = 24;
    this.d = 48;
  }

  private void d()
  {
    int[] arrayOfInt = getDrawableState();
    if ((this.q != null) && (this.q.isStateful()))
      this.q.setState(arrayOfInt);
    if ((this.p != null) && (this.p.isStateful()))
      this.p.setState(arrayOfInt);
  }

  void a()
  {
    if (getVisibility() != 0)
      return;
    if ((this.p instanceof Animatable))
    {
      this.w = true;
      this.o = null;
    }
    while (true)
    {
      postInvalidate();
      return;
      if (this.t == null)
        this.t = new LinearInterpolator();
      this.n = new Transformation();
      this.o = new AlphaAnimation(0.0F, 1.0F);
      this.o.setRepeatMode(this.j);
      this.o.setRepeatCount(-1);
      this.o.setDuration(this.k);
      this.o.setInterpolator(this.t);
      this.o.setStartTime(-1L);
    }
  }

  void a(int paramInt, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        boolean bool = this.l;
        if (bool)
          return;
        if (paramInt < 0)
        {
          i1 = 0;
          if (i1 > this.i)
            i1 = this.i;
          if (i1 == this.g)
            continue;
          this.g = i1;
          a(16908301, this.g, paramBoolean);
          continue;
        }
      }
      finally
      {
      }
      int i1 = paramInt;
    }
  }

  public void a(Context paramContext, int paramInt)
  {
    setInterpolator(AnimationUtils.loadInterpolator(paramContext, paramInt));
  }

  void b()
  {
    this.o = null;
    this.n = null;
    if ((this.p instanceof Animatable))
    {
      ((Animatable)this.p).stop();
      this.w = false;
    }
    postInvalidate();
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    d();
  }

  Shape getDrawableShape()
  {
    return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }

  public Drawable getIndeterminateDrawable()
  {
    return this.p;
  }

  public Interpolator getInterpolator()
  {
    return this.t;
  }

  public int getMax()
  {
    try
    {
      int i1 = this.i;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int getProgress()
  {
    try
    {
      boolean bool = this.l;
      if (bool);
      for (int i1 = 0; ; i1 = this.g)
        return i1;
    }
    finally
    {
    }
  }

  public Drawable getProgressDrawable()
  {
    return this.q;
  }

  public int getSecondaryProgress()
  {
    try
    {
      boolean bool = this.l;
      if (bool);
      for (int i1 = 0; ; i1 = this.h)
        return i1;
    }
    finally
    {
    }
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (!this.y)
    {
      if (verifyDrawable(paramDrawable))
      {
        Rect localRect = paramDrawable.getBounds();
        int i1 = getScrollX() + getPaddingLeft();
        int i2 = getScrollY() + getPaddingTop();
        invalidate(i1 + localRect.left, i2 + localRect.top, i1 + localRect.right, i2 + localRect.bottom);
      }
    }
    else
      return;
    super.invalidateDrawable(paramDrawable);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.l)
      a();
  }

  protected void onDetachedFromWindow()
  {
    if (this.l)
      b();
    if (this.u != null)
      removeCallbacks(this.u);
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      Drawable localDrawable = this.r;
      float f1;
      if (localDrawable != null)
      {
        paramCanvas.save();
        paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        long l1 = getDrawingTime();
        if (this.o != null)
        {
          this.o.getTransformation(l1, this.n);
          f1 = this.n.getAlpha();
        }
      }
      try
      {
        this.y = true;
        localDrawable.setLevel((int)(f1 * 10000.0F));
        this.y = false;
        if (SystemClock.uptimeMillis() - this.x >= 200L)
        {
          this.x = SystemClock.uptimeMillis();
          postInvalidateDelayed(200L);
        }
        localDrawable.draw(paramCanvas);
        paramCanvas.restore();
        if ((this.w) && ((localDrawable instanceof Animatable)))
        {
          ((Animatable)localDrawable).start();
          this.w = false;
        }
        return;
      }
      finally
      {
        localObject2 = finally;
        this.y = false;
        throw localObject2;
      }
    }
    finally
    {
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    while (true)
    {
      try
      {
        Drawable localDrawable = this.r;
        if (localDrawable != null)
        {
          i1 = Math.max(this.a, Math.min(this.b, localDrawable.getIntrinsicWidth()));
          i2 = Math.max(this.c, Math.min(this.d, localDrawable.getIntrinsicHeight()));
          d();
          int i3 = i1 + (getPaddingLeft() + getPaddingRight());
          int i4 = i2 + (getPaddingTop() + getPaddingBottom());
          setMeasuredDimension(resolveSize(i3, paramInt1), resolveSize(i4, paramInt2));
          return;
        }
      }
      finally
      {
      }
      int i2 = 0;
      int i1 = 0;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ProgressBarICS.SavedState localSavedState = (ProgressBarICS.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setProgress(localSavedState.a);
    setSecondaryProgress(localSavedState.b);
  }

  public Parcelable onSaveInstanceState()
  {
    ProgressBarICS.SavedState localSavedState = new ProgressBarICS.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.g;
    localSavedState.b = this.h;
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramInt2);
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.l)
    {
      if ((paramInt == 8) || (paramInt == 4))
        b();
    }
    else
      return;
    a();
  }

  public void postInvalidate()
  {
    if (!this.s)
      super.postInvalidate();
  }

  public void setIndeterminate(boolean paramBoolean)
  {
    try
    {
      if (((!this.m) || (!this.l)) && (paramBoolean != this.l))
      {
        this.l = paramBoolean;
        if (!paramBoolean)
          break label48;
        this.r = this.p;
        a();
      }
      while (true)
      {
        return;
        label48: this.r = this.q;
        b();
      }
    }
    finally
    {
    }
  }

  public void setIndeterminateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    this.p = paramDrawable;
    if (this.l)
    {
      this.r = paramDrawable;
      postInvalidate();
    }
  }

  public void setInterpolator(Interpolator paramInterpolator)
  {
    this.t = paramInterpolator;
  }

  public void setMax(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    try
    {
      if (paramInt != this.i)
      {
        this.i = paramInt;
        postInvalidate();
        if (this.g > paramInt)
          this.g = paramInt;
        a(16908301, this.g, false);
      }
      return;
    }
    finally
    {
    }
  }

  public void setProgress(int paramInt)
  {
    try
    {
      a(paramInt, false);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void setProgressDrawable(Drawable paramDrawable)
  {
    if ((this.q != null) && (paramDrawable != this.q))
      this.q.setCallback(null);
    for (int i1 = 1; ; i1 = 0)
    {
      if (paramDrawable != null)
      {
        paramDrawable.setCallback(this);
        int i2 = paramDrawable.getMinimumHeight();
        if (this.d < i2)
        {
          this.d = i2;
          requestLayout();
        }
      }
      this.q = paramDrawable;
      if (!this.l)
      {
        this.r = paramDrawable;
        postInvalidate();
      }
      if (i1 != 0)
      {
        a(getWidth(), getHeight());
        d();
        a(16908301, this.g, false, false);
        a(16908303, this.h, false, false);
      }
      return;
    }
  }

  public void setSecondaryProgress(int paramInt)
  {
    while (true)
    {
      try
      {
        boolean bool = this.l;
        if (bool)
          return;
        i1 = 0;
        if (paramInt < 0)
        {
          if (i1 > this.i)
            i1 = this.i;
          if (i1 == this.h)
            continue;
          this.h = i1;
          a(16908303, this.h, false);
          continue;
        }
      }
      finally
      {
      }
      int i1 = paramInt;
    }
  }

  public void setVisibility(int paramInt)
  {
    if (getVisibility() != paramInt)
    {
      super.setVisibility(paramInt);
      if (this.l)
      {
        if ((paramInt != 8) && (paramInt != 4))
          break label36;
        b();
      }
    }
    return;
    label36: a();
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (paramDrawable == this.q) || (paramDrawable == this.p) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ProgressBarICS
 * JD-Core Version:    0.6.2
 */