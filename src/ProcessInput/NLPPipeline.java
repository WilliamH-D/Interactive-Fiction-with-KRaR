package ProcessInput;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class NLPPipeline {

    private StanfordCoreNLP pipeline;

    public NLPPipeline() {
        // Silence the output stream from coreNLP
        PrintStream err = System.err;
        System.setErr(new PrintStream(new OutputStream() {
            public void write(int b) {
            }
        }));

        // set up pipeline properties
        Properties props = new Properties();
        // set the list of annotators to run
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,depparse");
        // set a property for an annotator, in this case the coref annotator is being set to use the neural algorithm
        props.setProperty("coref.algorithm", "neural");
        // build pipeline
        this.pipeline = new StanfordCoreNLP(props);

        // Restore the output stream
        System.setErr(err);
    }

    public StanfordCoreNLP getPipeline() { return this.pipeline; }
}
