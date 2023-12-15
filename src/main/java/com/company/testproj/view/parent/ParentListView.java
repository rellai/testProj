package com.company.testproj.view.parent;

import com.company.testproj.entity.Parent;

import com.company.testproj.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "parents", layout = MainView.class)
@ViewController("tp1_Parent.list")
@ViewDescriptor("parent-list-view.xml")
@LookupComponent("parentsDataGrid")
@DialogMode(width = "64em")
public class ParentListView extends StandardListView<Parent> {
}