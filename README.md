# spring-phaser
A simple project to kickstart your spring boot and semaphore journey

Note: In testing
1. Run the application by using any idea of your choice (example VSCode)
2. By using postman or any other testing application you can check the validity of the application. Paste the following info accordingly
   Endpoint :
     - GET http://localhost:8080/service/cdl (CountDownLatch)
     - GET http://localhost:8080/service/cb (CyclicBarrier)
4. Sample Response
   - Success
   - Check console log for cdl endpoint
     - This is thread 1
     - This is thread 2
     - Executed phaser as a count down latch
     - This is thread 3
   - Check console log for cb endpoint
     - This is thread 4
     - This is thread 5
     - This is thread 6
     - This is thread 6 resumes
     - This is thread 4 resumes
     - This is thread 5 resumes
   - Note : Order of execution depends on the handling of executor service
