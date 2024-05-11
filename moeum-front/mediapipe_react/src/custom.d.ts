declare module "*.mp3" {
    const src: string;
    export default src;
}

interface FlutterInAppWebView {
    callHandler(handlerName: string, ...args: any[]): Promise<string>;
}

interface Window {
    flutter_inappwebview?: FlutterInAppWebView;
}