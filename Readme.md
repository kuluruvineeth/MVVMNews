# News 🧿
Modern News App is a simple news app 🗞️  built to demonstrate the use of modern android architecture component with MVVM Architecture 🏗 which uses NewsAPI to fetch breaking news, search any news from various countries and save to local database for further reading. *Made with love ❤️ by [Kuluruvineeth](https://github.com/kuluruvineeth)*

<br />

## Preview 🌞
Breaking News | Web View | Saving | Saved News | Delete Saved 
--- | --- | --- |--- |--- 
![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_1.png) | ![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_2.png) | ![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_3.png) | ![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_4.png) | ![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_5.png)
Search News | Searched News | Internet Check | 
![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_6.png) | ![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_7.png) | ![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/img_8.png)

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on Configuration changes.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
  - [Jetpack Navigation](https://developer.android.com/guide/navigation) - Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content(fragments) within your app
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android.
- [Glide](https://github.com/bumptech/glide) - Fast and Efficient open source media management and image loading framework.

<br />

## Package Structure 📦

    com.kuluruvineeth.mvvmnews    # Root Package
    ├── adapters                  # Adapter for RecyclerView 
    ├── api                       # For api handling.
    │   ├── NewsAPI               # News Api endpoints
    |   ├── RetrofitInstance      # Created Retrofit Instance   
    |
    ├── db                        # For db handling
    |   ├── ArticleDao            # Data Access Object for Article
    |   ├── ArticleDatabase       # Article Database Instance
    |   ├── Converters            # Type Converters
    |
    ├── models                    # Model classes
    │   ├── Article               # Article data class
    │   ├── NewsResponse          # NewsResponse data class
    │   ├── Source                # Source data class
    ├── repository                # Used to handle all data operations
    │   ├── NewsRepository        # NewsRepository class
    ├── ui                        # Used to handle all view layer
    │   ├── fragments             # All fragments
    │       ├── ArticleFragment            
    │       ├── BreakingNewsFragment      
    │       ├── SavedNewsFragment
    |       ├── SearchNewsFragment
    │   ├── NewsActivity            # main news activity
    │   ├── NewsViewModel           # NewsViewModel interacting with repository and fragments
    │   ├── NewsViewModelFactory
    |── util                        # Used to handle all data operations
    │   ├── Constants
    |   ├── Resource
    |── BaseApplication             
    
## Architecture 🗼
This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.

![](https://github.com/kuluruvineeth/MVVMNews/blob/master/screenshots/architecture.png)

## Build-tool 🧰
You need to have [Android Studio](https://developer.android.com/studio/preview) to build this project.
<br>
<img src="./screenshots/android.png" height="200" alt="android-studio"/>

<br>

## Contribute 🤝
If you want to contribute to this app, you're always welcome!

## Contact 📩
Have an project? DM me at 👇

Drop a mail to:- kuluruvineeth8623@gmail.com

<br>

Thank You 🙏👏


    
