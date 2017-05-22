# LogUtil-Android
(https://jitpack.io/#syedsamarulhuda/LogUtil-Android)
### About

LogUtil Library is used to manage your Log during release and debug build.
By passing "true" in parameter along with log Tag and data to display.
```sh
   LogUtil.d(true,"Tag","Data");
```
         
And  if dont want display Log Just pass "false".

```sh
    LogUtil.d(false,"Tag","Data");
```

Best way is that we can have global varibale flag in your constant class and pass that variable in LogUtil.d  .
     
          
            public static final boolean IS_DEBUG= true;
           
              
             LogUtil.d(IS_DEBUG,"Tag","Data"); 
              

### Adding Dependencies

- In root Gradle, add below code

```sh
allprojects {
    repositories {
        jcenter()

        maven { url 'https://jitpack.io' }
    }
}

```

- In app Gradle, add below code

```sh
dependencies {
       compile 'com.github.syedsamarulhuda:LogUtil-Android:0.2.0'
    }
```


