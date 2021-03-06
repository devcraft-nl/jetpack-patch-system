package be.ida_mediafoundry.jetpack.patchsystem.ondeploy.services;

import be.ida_mediafoundry.jetpack.patchsystem.models.PatchFileWithResultResource;
import be.ida_mediafoundry.jetpack.patchsystem.models.PatchFile;
import be.ida_mediafoundry.jetpack.patchsystem.ondeploy.models.OnDeployPatchResult;
import org.apache.sling.api.resource.ResourceResolver;

import java.util.List;

public interface OnDeployScriptSystemService {

    boolean isPatchSystemReady();

    List<PatchFile> getPatchesToExecute();

    List<PatchFileWithResultResource> getPatches(ResourceResolver resourceResolver);

    OnDeployPatchResult runPatch(String patchPath);
}