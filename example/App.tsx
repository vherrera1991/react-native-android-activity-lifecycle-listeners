import * as AndroidActivityLifecycleListenersModule from "@islacel/react-native-android-activity-lifecycle-listeners";
import { useEffect } from "react";
import { StyleSheet, Text, View } from "react-native";

export default function App() {
  const loadApp = async () => {
    const response =
      await AndroidActivityLifecycleListenersModule.getInitialProps();
    console.log(response);
  };

  useEffect(() => {
    loadApp();
  }, []);

  return (
    <View style={styles.container}>
      <Text>Hello world!</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
});
