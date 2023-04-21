package krasa.mavenhelper.action;

import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import krasa.mavenhelper.model.Goal;

import javax.swing.*;
import java.util.List;

public class QuickRunRootMavenGoalAction extends QuickRunMavenGoalAction implements DumbAware {

	private final Logger LOG = Logger.getInstance("#" + getClass().getCanonicalName());

	@Override
	protected void fillActions(final Project currentProject, DefaultActionGroup group, DataContext dataContext) {
		if (currentProject != null) {
			group.addAll(new RootMavenActionGroup() {

				@Override
				protected void addTestFile(List<AnAction> result) {
					QuickRunRootMavenGoalAction.this.addTestFile(result);
				}

				@Override
				protected AnAction getRunConfigurationAction(Project project, RunnerAndConfigurationSettings cfg) {
					return QuickRunRootMavenGoalAction.this.getRunConfigurationAction(project, cfg);
				}
				@Override
				protected AnAction createGoalRunAction(Goal goal, final Icon icon, boolean plugin, MavenProjectInfo mavenProject) {
					return QuickRunRootMavenGoalAction.this.createGoalRunAction(goal, icon, plugin, mavenProject);
				}
			}.getActions(dataContext, currentProject));
		}
	}


	@Override
	protected JBPopupFactory.ActionSelectionAid getAidMethod() {
		return JBPopupFactory.ActionSelectionAid.SPEEDSEARCH;
	}

}
