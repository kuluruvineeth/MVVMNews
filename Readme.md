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

    com.kuluruvineeth.mvvmnews # Root Package
    ├── adapters               # Adapter for RecyclerView 
    ├── api                    # For api handling.
    │   ├── NewsAPI            # News Api endpoints
    |   ├── RetrofitInstance   # Created Retrofit Instance   
    |
    ├── db                     # For db handling
    |   ├── ArticleDao         # Data Access Object for Article
    |   ├── ArticleDatabase    # Article Database Instance
    |   ├── Converters         # Type Converters
    |
    ├── view                # Activity/Fragment View layer
    │   ├── main            # Main root folder
    |   │   ├── main        # Main Activity for RecyclerView
    |   │   └── viewmodel   # Transaction ViewModel
    |   │   ├── adapter     # Adapter for RecyclerView
    │   ├── Dashboard       # Dashboard root folder
    |   |   |__ dashboard   # Dashboard 
    │   ├── Add             # Add Transaction root folder
    |   |   |__ add         # Add Transaction 
    │   ├── Edit            # Edit Transaction root folder
    |   |   |__ edit        # Edit Transaction
    │   ├── Details         # Add Transaction root folder
    |   |   |__ details     # Transaction Details
    │   ├── About           # About root folder
    |   |   |__ about       # About 
    │   ├── Dialog          # All Dialogs root folder
    |   |   |__ dialog      # Error Dialog 
    ├── utils               # All extension functions
