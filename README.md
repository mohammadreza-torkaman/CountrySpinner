
[![](https://jitpack.io/v/mohammadreza-torkaman/CountrySpinner.svg)](https://jitpack.io/#mohammadreza-torkaman/CountrySpinner)
# CountrySpinner

This is a custom adapter for android spinner to support different countries

# How to
>Step 1. Add the JitPack repository to your build file
```
allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
```    
>Step 2. Add the dependency
```   
	dependencies {
	        implementation 'com.github.mohammadreza-torkaman:CountrySpinner:v1.0'
	}
```   
>Step 3. Use Adapter

You can use the adapter with default items like this :
```   
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = CountrySpinnerAdapter(this)
        
```   

if you want to use your own items you can use **SpinerItem** class
```
SpinnerItem("US", "840", "+1", R.drawable.id_of_the_flag)
```

You can also use your own view for the items , but you **must keep** ids of the elements.
Your xml should contains two textview and one image view with these ids:

1. country code text view id : country_code
 
2. country name text view id : country_name
 
3. country flag image view id : country_flag

here is an example :
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <LinearLayout
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:gravity="center"
        android:layoutDirection="ltr"
        android:orientation="horizontal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toRightOf="@+id/country_flag"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <TextView
            android:id="@+id/country_code"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_vertical"
            android:layout_marginRight="4dp"
            android:gravity="center"
            android:minEms="3"
            android:textColor="@android:color/black"
            tools:text="+1" />

        <TextView
            android:id="@+id/country_name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:layout_marginLeft="4dp"
            android:minEms="2"
            android:textColor="@android:color/black"
            tools:text="US" />

    </LinearLayout>

    <ImageView
        android:id="@+id/country_flag"
        android:layout_width="36dp"
        android:layout_height="36dp"
        android:layout_gravity="center_vertical"
        android:layout_marginLeft="15dp"
        android:adjustViewBounds="true"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:srcCompat="@tools:sample/backgrounds/scenic" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

![processed](https://user-images.githubusercontent.com/83089712/120054321-7e0ca880-c044-11eb-948c-65bbe023ff22.jpeg)
