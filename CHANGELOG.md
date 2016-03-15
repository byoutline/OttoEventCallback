ottoeventcallback 1.3.2, anythreadbus 1.0.0 *(2016-03-16)*
----------------------------------------------------------
 * `PostFromAnyThreadBus` and `PostFromAnyThreadIBus` moved to `anythreadbus`, so they can be used without
   `EventCallback` dependency. No new functionality.
 
ottoeventcallback 1.3.1, ottoeventcallback-api 1.0.1 *(2015-12-03)*
-------------------------------------------------------------------
 * Refactor, No changes
   
ottoeventcallback 1.3.0, ottoeventcallback-api 1.0.0 *(2015-12-15)*
-------------------------------------------------------------------
 * `OttoBus` and `OttoIBus` moved to `ottoeventcallback-api` module, that does not depend on `Android`, or `EventCallback`
   does not have hard dependency on `Otto`. No new functionality.

ottoeventcallback 1.2.4 *(2015-12-14)*
--------------------------------------
* Refactor, No changes

ottoeventcallback 1.2.3 *(never released)*
------------------------------------------

ottoeventcallback 1.2.2 *(2014-12-01)*
--------------------------------------
 * `PostFromAnyThreadIBus` added - `IBus` implementation that uses provided `Otto` bus instance to post
   on `Android` main thread.
 
ottoeventcallback 1.2.1 *(2014-09-01)*
--------------------------------------
 * First public release (`OttoBus`, `OttoIBus`, `PostFromAnyThreadBus`)