
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

![processed](https://user-images.githubusercontent.com/83089712/120054321-7e0ca880-c044-11eb-948c-65bbe023ff22.jpeg)
