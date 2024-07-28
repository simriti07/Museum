/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package artifacts;

import visitors.ArtifactVisitor;
import java.util.Map;

/**
 *
 * @author DELL
 */
public abstract class Artifact {
    protected Map<String, String> details;

    public Artifact(Map<String, String> details) {
        this.details = details;
    }

    public String getName(String language) {
        return details.get(language + "_name");
    }

    public abstract void accept(ArtifactVisitor visitor, String language);
}

