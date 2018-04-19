try { //inside this code I attempt to open a file as an input stream
      //filenotfound exceptions continue to be thrown
      //this code is being run in android studio on an empty project (oncreate) in debug mode

            File inputfile = new File("/main/res/raw/inputfile.wav"); //attempt to create file object
            
            
            File testfile = inputfile.getAbsoluteFile(); //for information
            String teststring = inputfile.getAbsolutePath();

            inputfile.setReadable(true); //attempt to make the file accessable
            inputfile.setWritable(true);
            boolean caniread = inputfile.canRead(); //if this returns false, the next line will throw an exception

            InputStream tester = new FileInputStream(inputfile); //this object would be used to read from the wavfile

            catch(Exception e){
            e.printStackTrace();
            String Failure = e.getMessage();
           
        }