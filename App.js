import React, { Component } from 'react';
import { View, Text,NativeModules, Platform } from 'react-native';

export default class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
    };
  }
moveToActivity(){
  NativeModules.OpenActivity.open()
}
  render() {
    return (
      <View style={{flex:1,justifyContent:'center',alignItems:'center'}}>
        <Text onPress={()=>this.moveToActivity()} style={{fontSize:25}}> Open Android Activity </Text>
      </View>
    );
  }
}
