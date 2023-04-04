import AndroidActivityLifecycleListenersModule from "./AndroidActivityLifecycleListenersModule";

export async function getInitialProps() {
  return await AndroidActivityLifecycleListenersModule.getInitialProps();
}
