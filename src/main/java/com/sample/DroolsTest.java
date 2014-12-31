package com.sample;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            ksession.fireAllRules();
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }

    public static class Pozycja {
    	public int value;
    	
    	public Pozycja(int v) {
    		value = v;
    	}
    }
    
    public static class Ego {
    	public int value;
    	
    	public Ego(int v) {
    		value = v;
    	}
    	
    }
    
    public static class Podrywanie {
    	public boolean value;
    	
    	public Podrywanie(boolean v) {
    		value = v;
    	}
    }
    
    public static class Agresja {
    	public int value;
    	
    	public Agresja(int v) {
    		value = v;
    	}
    }
    
    public static class Zel {
    	public int value;
    	
    	public Zel(int v) {
    		value = v;
    	}
    }
    
    public static class Nurkowanie {
    	public int value;
    	
    	public Nurkowanie(int v) {
    		value = v;
    	}
    }
    
    public static class Szybkosc {
    	public int value;
    	
    	public Szybkosc(int v) {
    		value = v;
    	}
    }
    
    public static class Wypady {
    	public boolean value;
    	
    	public Wypady(boolean v) {
    		value = v;
    	}
    }
    
    public static class Szczescie {
    	public int value;
    	
    	public Szczescie(int v) {
    		value = v;
    	}
    }
    
    public static class Wzrost {
    	public int value;
    	
    	public Wzrost(int v) {
    		value = v;
    	}
    }
    
    public static class Wiek {
    	public int value;
    	
    	public Wiek(int v) {
    		value = v;
    	}
    }
    
    public static class Banany {
    	public boolean value;
    	
    	public Banany(boolean v) {
    		value = v;
    	}
    }
    
    public static class Taktyka {
    	public int value;
    	
    	public Taktyka(int v) {
    		value = v;
    	}
    }
    
    public static class Imprezy {
    	public boolean value;
    	
    	public Imprezy(boolean v) {
    		value = v;
    	}
    }
    
    public static class Lider {
    	public boolean value;
    	
    	public Lider(boolean v) {
    		value = v;
    	}
    }
}
