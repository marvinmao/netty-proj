package cn.enjoyedu;

/**
 * @author marvinmao
 *
 * 类说明：
 */
public class AsyncServletDemo {

//    //监听器里初始化线程池
//    static class listener implements ServletContextListener{
//
//        public void contextInitialized(ServletContextEvent sce) {
//            //初始化
//        }
//
//        public void contextDestroyed(ServletContextEvent sce) {
//            //销毁线程池
//
//        }
//    }
//
//    class work implements Runnable{
//
//        public void run() {
//            //do business work
//            //AsyncContext
//            //get response
//        }
//    }
//
//    //3
//    class AsnycLi implements AsyncListener{
//
//        public void onComplete(AsyncEvent event) throws IOException {
//
//        }
//
//        public void onTimeout(AsyncEvent event) throws IOException {
//
//        }
//
//        public void onError(AsyncEvent event) throws IOException {
//
//        }
//
//        public void onStartAsync(AsyncEvent event) throws IOException {
//
//        }
//    }
//
//      //4
//    @WebServlet(asyncSupported=true)
//    class AsyncBusiServlet extends HttpServlet{
//        doGet(){
//            AsyncContext asyncContext = request.statrAsync();
//            asyncContext(new AppAsyncListener());
//            threadPool.execute(new BusiProcessor(asyncContext));
//        }
//    }


}