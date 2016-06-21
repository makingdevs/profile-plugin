
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        classNode.putNodeMetaData('projectVersion', '0.1.61')
        classNode.putNodeMetaData('projectName', 'profile-plugin')
        classNode.putNodeMetaData('isPlugin', 'true')
    }
}
