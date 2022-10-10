#import "PaynavLibPlugin.h"
#if __has_include(<paynav_lib/paynav_lib-Swift.h>)
#import <paynav_lib/paynav_lib-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "paynav_lib-Swift.h"
#endif

@implementation PaynavLibPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftPaynavLibPlugin registerWithRegistrar:registrar];
}
@end
